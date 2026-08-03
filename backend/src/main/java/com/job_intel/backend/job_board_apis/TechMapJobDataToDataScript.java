package com.job_intel.backend.job_board_apis;

import java.time.LocalDate;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.apache.tomcat.util.digester.SystemPropertySource;
import org.json.*;
import org.springframework.stereotype.Component;

import com.job_intel.backend.models.Company;
import com.job_intel.backend.models.Job;
import com.job_intel.backend.models.JobSkill;
import com.job_intel.backend.models.Skill;
import com.job_intel.backend.repositories.CompanyRepository;
import com.job_intel.backend.repositories.JobRepository;
import com.job_intel.backend.repositories.SkillRepository;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class TechMapJobDataToDataScript {

    private CompanyRepository cRepository;
    private SkillRepository sRepository;
    private JobRepository jRepository;

    public void mapJobDataToEntity(String jobDataBody) {

        String jsoString = jobDataBody;
        JSONObject obj = new JSONObject(jsoString);

        JSONArray arr = obj.getJSONArray("result");

        // results [10]
        // results at i = {occ, title, skill[], etc}
        for (int i = 0; i < arr.length(); i++) {
            String company = arr.getJSONObject(i).getString("company");

            // company table setup and insertion
            Company comp = new Company();
            comp.setName(company);

            if (!cRepository.existsByName(comp.getName())) {
                cRepository.save(comp);
            }

            Job jobEntity = new Job();
            String title = arr.getJSONObject(i).getString("title");
            // use comp for company
            String locationCheck = arr.getJSONObject(i).optString("city");
            String location;
            if (locationCheck == "") {
                location = "Remote";
            } else {
                location = locationCheck;
            }

            Integer minSalary = arr.getJSONObject(i).getJSONObject("jsonLD").getJSONObject("baseSalary")
                    .getJSONObject("value").getInt("minValue");
            Integer maxSalary = arr.getJSONObject(i).getJSONObject("jsonLD").getJSONObject("baseSalary")
                    .getJSONObject("value").getInt("maxValue");
            String description = arr.getJSONObject(i).getJSONObject("jsonLD").getString("description");
            String jobUrl = arr.getJSONObject(i).getJSONObject("jsonLD").getString("url");
            String datePosted = arr.getJSONObject(i).getJSONObject("jsonLD").getString("datePosted");
            LocalDate postedDate = LocalDate.parse(datePosted);

            // how am i going to do this step: @OneToMany(mappedBy = "job") private
            // List<JobSkill> jobSkills;
            // for each job, place an entry with the job id and the skill id for each skill
            // assoicated with this job and place it in the job_skills table

            Job storedJob = Job.builder().title(title).company(comp).location(location).salaryMin(minSalary)
                    .salaryMax(maxSalary).description(description).jobUrl(jobUrl).postedDate(postedDate).build();

            // new theory just populate the job skills table and let spring handle this list
            // populate job skills table, so populate the job first

            JSONArray skillsArray = arr.getJSONObject(i).optJSONArray("skills");
            /*
             * if( skillsArray != null) { System.out.println(l + ": " + skillsArray); }
             */

            if (skillsArray != null) {
                for (int j = 0; j < skillsArray.length(); j++) {

                    String skillName = skillsArray.getString(j);
                    Skill skillObj = new Skill();
                    skillObj.setName(skillName);

                    if (!sRepository.existsByName(skillObj.getName())) {
                        sRepository.save(skillObj);
                    }

                    // for each job, place its skill and job in the job skill table
                    // job 1 has - communication, sodering, communication job 2 has booking,
                    // communication
                    // for each skill in the job, place job + skill in the job_skill table only if
                    // job_skills doesn't contain a job + skill entry already. how do i check that
                    // job + skill doesnt exist

                }
            }

            // gotta do the job skill entry BUT after jobs are inserted
            // id, job_id, skill_id
            /*
             * Job entity: id - auto gen title - title field, but may be too naunced company
             * - needs to map to the company id in its table or just store the company id
             * jsonLd - base salary - value - minValue and maxValue for min and max salary
             */
            /*
             * results at i = {occ, title, skill[], etc} - > skill{0: skill 0, 1: skill 1,
             * 2: skill 2,} get the skill id by name,
             * 
             * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
             * 
             * @Column(nullable = false) private String title;
             * 
             * // how does it work when saving comp in the map script
             * 
             * @ManyToOne
             * 
             * @JoinColumn(name = "company_id", nullable = false) private Company company;
             * 
             * private String location;
             * 
             * @Column(name = "salary_min") private Integer salaryMin;
             * 
             * @Column(name = "salary_max") private Integer salaryMax;
             * 
             * @Column(nullable = false) private String description;
             * 
             * @Column(name = "job_url", nullable = false, unique = true) private String
             * jobUrl;
             * 
             * // how does this get populated, is it a db thing?
             * 
             * @Column(name = "posted_date") private LocalDate postedDate;
             * 
             * @Column(name = "created_at", insertable = false, updatable = false) private
             * LocalDateTime createdAt;
             * 
             * // break down this right here // so far, its one job has many job skill
             * entries and they are mapped by the job // field in the jobSkills
             * 
             * @OneToMany(mappedBy = "job") private List<JobSkill> jobSkills;
             */

        }

    }

}
