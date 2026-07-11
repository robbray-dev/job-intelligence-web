package com.job_intel.backend;

public class JsonEx {
    public static String jsonTemp(){
       return "{\r\n" + //
                      "    \"api\": \"Techmap.io Job Posting API\",\r\n" + //
                      "    \"apiVersion\": \"v2.6\",\r\n" + //
                      "    \"apiEndpoint\": \"GET search result for Job Postings by countryCode, dateCreated, language, industry, timezone, workPlace, etc.\",\r\n" + //
                      "    \"page\": 1,\r\n" + //
                      "    \"pageSize\": 10,\r\n" + //
                      "    \"totalCount\": 4944,\r\n" + //
                      "    \"query\": {\r\n" + //
                      "        \"query\": {\r\n" + //
                      "            \"bool\": {\r\n" + //
                      "                \"must\": [\r\n" + //
                      "                    {\r\n" + //
                      "                        \"range\": {\r\n" + //
                      "                            \"dateCreated\": {\r\n" + //
                      "                                \"gte\": \"2026-07-09T00:00:00.000Z\",\r\n" + //
                      "                                \"lte\": \"2026-07-09T23:59:59.999Z\"\r\n" + //
                      "                            }\r\n" + //
                      "                        }\r\n" + //
                      "                    },\r\n" + //
                      "                    {\r\n" + //
                      "                        \"term\": {\r\n" + //
                      "                            \"hasSalary\": true\r\n" + //
                      "                        }\r\n" + //
                      "                    },\r\n" + //
                      "                    {\r\n" + //
                      "                        \"match\": {\r\n" + //
                      "                            \"countryCode\": \"us\"\r\n" + //
                      "                        }\r\n" + //
                      "                    }\r\n" + //
                      "                ]\r\n" + //
                      "            }\r\n" + //
                      "        }\r\n" + //
                      "    },\r\n" + //
                      "    \"result\": [\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Manager\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Castroville\",\r\n" + //
                      "            \"timezone\": \"PDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Services\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4ef8f2965f72784350d729\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FullTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"24.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"27.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Benefits:**\\n\\n* Health insurance\\n* Opportunity for advancement\\n* Training \\\\& development\\n* Vision insurance\\n* 401(k) matching\\n* Dental insurance  \\nSERVPRO of Monterey Peninsula is hiring a **Restoration Supervisor**!  \\n\\n**Benefits**  \\nSERVPRO of Monterey Peninsula offers:\\n\\n* Competitive compensation\\n* Superior benefits\\n* Career progression\\n* Professional development\\n\\nAnd more!  \\nAs the front-line representative of the SERVPRO® brand, the **Restoration Supervisor** demonstrates the company's Here to Help® commitment to customers and clients. This is done by coordinating, monitoring, and performing work activities on projects to successfully fulfill service needs and facilitate a positive customer experience.  \\n\\n**Key Responsibilities**\\n\\n* Coordinate and perform production processes as scheduled and ensure quality control\\n* Manage the customer and client experience and overall customer satisfaction tracked with online reviews\\n* Communicate clear expectations to restoration technicians and supervise their activities\\n* Document a detailed and accurate job file to support the services provided\\n* Manage labor and consumable item usage on assigned projects\\n* Communicate with restoration project manager and office staff on project progress and issues\\n\\n**Additional Responsibilities:**\\n\\n* Communicate and follow all OSHA guidelines for job safety\\n* Manage assets by protecting and using equipment and materials properly\\n* Coach and train restoration technicians\\n\\n**Position Requirements**\\n\\n* Valid driver's license\\n* High school diploma/GED (preferred)\\n* At least 1 year of experience in cleaning, restoration, or construction\\n* IICRC certification a plus, not required\\n\\n**Skills/Physical Demands/Competencies**\\n\\n* Ability to lift a minimum of 50 pounds regularly, occasionally up to 100 pounds with assistance\\n* Ability to climb ladders, work at ceiling heights, work in tight spaces (i.e. crawl spaces, attics)\\n* Ability to repetitively push/pull/lift/carry objects\\n* Ability to work with/around cleaning agents\\n\\nEach SERVPRO® Franchise is Independently Owned and Operated.  \\n*All employees of a SERVPRO Franchise are hired by, employed by, and under the sole supervision and control of an independently owned and operated Servpro Franchise. Servpro Franchise employees are not employed by, jointly employed by, agents of or under the supervision or control of Servpro Industries, LLC or Servpro Franchisor, LLC (the Franchisor), in any manner whatsoever. All Sample Forms provided by Servpro Industries to Servpro Franchises should be reviewed and approved by the Franchise's attorney for compliance with Federal, State and Local laws. All Sample Forms are provided for informational purposes and Servpro Franchises may choose whether or not to use them.*\",\r\n" + //
                      "                \"industry\": \"Services\",\r\n" + //
                      "                \"jobBenefits\": \"Pension Plan\",\r\n" + //
                      "                \"title\": \"Restoration Supervisor\",\r\n" + //
                      "                \"directApply\": true,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://iicrc-careers.careerplug.com/jobs/3489663\",\r\n" + //
                      "                \"relevantOccupation\": \"Manager\",\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"f14216cfcd2ad2a063b15589\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"SERVPRO of Monterey Peninsula\",\r\n" + //
                      "                    \"logo\": \"https://d2zpdrfrohaf9r.cloudfront.net/system/images/1054372/original/IICRC_Logo_Transparent.png\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://servpro.com\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"13063369711df4c0a780040e\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"95012\",\r\n" + //
                      "                        \"addressLocality\": \"Castroville\",\r\n" + //
                      "                        \"addressRegion\": \"CA\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 36.76195,\r\n" + //
                      "                    \"name\": \"Castroville, CA, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -121.7518\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"PDT Timezone\",\r\n" + //
                      "                \"sameAs\": \"https://iicrc-careers.careerplug.com/jobs/3489663\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"careerplug_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -121.7518,\r\n" + //
                      "                \"lat\": 36.76195\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Restoration Supervisor\",\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:00:00.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -7,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"SERVPRO of Monterey Peninsula\",\r\n" + //
                      "            \"state\": \"CA\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"careerplug\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 24,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Janitorial\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Myrtle Beach\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Services\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4ef8f4965f72784350d72c\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"16.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"17.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Benefits:**\\n\\n* Opportunity for advancement\\n* Paid time off\\n* 401(k)\\n* 401(k) matching\\n* Bonus based on performance  \\nImmediate openings for part time roles.  \\n\\n**Open Multiple Custodial Shifts:**\\n\\n* Days:\\n\\n* Monday, Wednesday, Friday - 9:30AM - 1:30pm\\n* Evenings\\n\\n* Tuesday - 6:00pm - 10pm\\n\\n* Thursday - 6:00pm - 10pm\\n* Weekends\\n\\n* Saturday - 11:00AM to 5:00pm\\n\\n* Sunday - 2:00pm to 7:00pm\\n\\nThis is a fun place to work and we can accomodate any arrangement or number of shifts.  \\n\\n**Our essential team members enjoy:**\\n\\n* Competitive Pay\\n* Paid Training\\n* 401k with employer matching options\\n* Pay via direct deposit\\n* Paid Time Off\\n\\n**Responsibilities:**\\n\\n* This position is responsible for creating cleaner, healthier environments for our customers', their students and grounds by performing the following essential duties and responsibilities. Duties include, but not limited to:\\n* Perform all cleaning duties for facilities using provided ServiceMaster products, tools and procedures\\n* Sweeping, mopping, polishing, trash removal, restroom cleaning, windows, dusting\\n* Maintain inventory of supplies and equipment.\\n* Use proper PPE where required\\n* Opens and locks facilities, enable and disable security system as required\\n\\n**Physical Demands and Qualifications:**\\n\\n* Constant (up to 100%) standing, walking, pushing, kneeling, twisting, reaching\\n* Must be able to lift and/or carry up to 25lbs.\\n* Ability to differentiate between cleaning products and uses\\n* 1-2 years' experience as a custodian, janitor, or housekeeper a plus but not required\\n* Will provide on the job training to those with strong work ethic and willingness to learn.\\n* The ability to be flexible and work at a fast pace in a multi-tasked job is a must.\\n* Contribute to a positive work climate with a pleasant attitude\\n* Contribute to the overall team effort including being in uniform, dependable and on time\\n* Treat all co-workers and customers with courtesy and respect\",\r\n" + //
                      "                \"industry\": \"Services\",\r\n" + //
                      "                \"jobBenefits\": \"Paid Holidays, Pension Plan\",\r\n" + //
                      "                \"title\": \"Janitorial positions in Pawleys Island Area with a Great Fun Team\",\r\n" + //
                      "                \"directApply\": true,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://iicrc-careers.careerplug.com/jobs/3489645\",\r\n" + //
                      "                \"relevantOccupation\": \"Janitorial\",\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"f14216cfcd2ad2a063b15589\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"ServiceMaster Janitorial Solutions\",\r\n" + //
                      "                    \"logo\": \"https://d2zpdrfrohaf9r.cloudfront.net/system/images/1054372/original/IICRC_Logo_Transparent.png\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://greenhomesolutions.com\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"8b482d55d5feaf9c313a083a\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"29572\",\r\n" + //
                      "                        \"addressLocality\": \"Myrtle Beach\",\r\n" + //
                      "                        \"addressRegion\": \"SC\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 33.6890603,\r\n" + //
                      "                    \"name\": \"Myrtle Beach, SC, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -78.8866943\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\",\r\n" + //
                      "                \"sameAs\": \"https://iicrc-careers.careerplug.com/jobs/3489645\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"careerplug_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -78.8866943,\r\n" + //
                      "                \"lat\": 33.6890603\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Janitorial positions in Pawleys Island Area with a Great Fun Team\",\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:00:00.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"ServiceMaster Janitorial Solutions\",\r\n" + //
                      "            \"state\": \"SC\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"careerplug\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 16,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"PartTime\",\r\n" + //
                      "                \"Shift\",\r\n" + //
                      "                \"Weekends\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Clerk\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:01:10.000Z\",\r\n" + //
                      "            \"city\": \"Milford\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Environmental\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f030996e6cd2a3602e69c\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"90000\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"100000\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"YEAR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Position Summary:**\\n\\nThe Senior Accountant supports the day-to-day accounting and financial reporting functions of the organization to promote accuracy, compliance, and efficiency across the finance function. This role contributes to the preparation of financial statements, account reconciliations, cost accounting analyses, and audit support activities while assisting with budgeting, reporting, and continuous process improvement initiatives. The position is also partnered with operations and finance teams to support financial visibility and informed decision-making.\\n\\n**Responsibilities:**\\n\\n• Prepare and analyze financial statements to support accurate and timely financial reporting in accordance with accounting standards.\\n\\n• Reconcile general ledger accounts and research discrepancies to maintain accurate financial records.\\n\\n• Assist with monthly, quarterly, and annual close processes and related financial reporting activities.\\n\\n• Support accounts payable and accounts receivable processes to help ensure timely and accurate transaction processing.\\n\\n• Perform fixed asset accounting activities, including depreciation schedules and asset tracking.\\n\\n• Assist with cost accounting functions, including inventory analysis, standard costing, margin analysis, and manufacturing cost reporting.\\n\\n• Support budgeting and forecasting processes through financial analysis and reporting.\\n\\n• Prepare audit schedules and support documentation for internal and external audit requests.\\n\\n• Maintain compliance with company policies, GAAP, and applicable regulatory requirements.\\n\\n• Identify opportunities for process improvements and assist with implementation of best practices to enhance efficiency and accuracy.\\n\\n• Collaborate cross-functionally with operations, purchasing, and finance teams to support reporting and business initiatives.\\n\\n**Skills and Experience:**\\n\\n• Strong understanding of accounting principles and financial reporting.\\n\\n• Excellent analytical and problem-solving skills.\\n\\n• High attention to detail and organizational abilities.\\n\\n• Strong verbal and written communication skills.\\n\\n• Ability to manage multiple priorities and meet deadlines.\\n\\n• Proficiency in Microsoft Office Suite, particularly Excel.\\n\\n• Experience with accounting software and ERP systems preferred.\\n\\n• Bachelor's degree in accounting, finance, or a related field required; CPA or CMA certification preferred.\\n\\n• Five or more years of accounting experience, preferably in a senior or supervisory role.\\n\\n**Other Details:**\\n\\n• Work Environment: Office setting with regular interaction with production and warehouse areas.\\n\\n• Physical Demands: Role may require occasional walking, standing, and warehouse site visits.\\n\\n• Schedule: Full-time, Monday to Friday, with flexibility for extended hours as needed.\\n\\n• Travel: Occasional travel may be required for supplier visits, conferences, and inter-facility coordination.\\n\\n• ADA Compliance: Alinabal is committed to providing reasonable accommodations in accordance with the Americans with Disabilities Act (ADA). Employees who require accommodation or have work restrictions will be supported through an interactive process to ensure safe and effective performance of essential job functions.\\n\\n*The duties listed above are intended only as illustrations of the various types of work that may be performed. The omission of specific statements of duties does not exclude them from the position if the work is similar, related, or a logical assignment to the position.*\\n\\n*The job description does not constitute an employment agreement between the employer and employee and is subject to change by the employer as the needs of the employer and requirements of the job change.*\\n\\nAlinabal is an Equal Opportunity Employer. We celebrate diversity and are committed to creating an inclusive environment for all employees. All qualified applicants will receive consideration for employment without regard to race, color, religion, gender, sexual orientation, gender identity, national origin, disability, or veteran status.\\n\\nYou should be proficient in:\\n\\n* Bachelor's Degree\\n* Generally Accepted Accounting Principles (GAAP)\\n* Cost Accounting\\n* Accounts Payable (AP)\\n* Accounts Receivable (AR)\\n* Bank Reconciliation\\n* Financial Audit Experience\\n\\nMachines \\\\& technologies you'll use:\\n\\n* Accounting Software\",\r\n" + //
                      "                \"industry\": \"Environmental\",\r\n" + //
                      "                \"title\": \"Senior Accountant\",\r\n" + //
                      "                \"directApply\": false,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://100hires.com/j/sZ9BE4f\",\r\n" + //
                      "                \"relevantOccupation\": \"Clerk\",\r\n" + //
                      "                \"skills\": [\r\n" + //
                      "                    \"Microsoft Excel\",\r\n" + //
                      "                    \"Microsoft Office\"\r\n" + //
                      "                ],\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"43fc71219a7f95230e1b4eb5\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"Alinabal - Manufacturing Facilities\",\r\n" + //
                      "                    \"logo\": \"https://100hires.com/\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"8c1b6c6e9b52eaa0bc4cc444\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"06460\",\r\n" + //
                      "                        \"addressLocality\": \"Milford\",\r\n" + //
                      "                        \"addressRegion\": \"CT\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 41.222,\r\n" + //
                      "                    \"name\": \"Milford, CT, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -73.056\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"100hires_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -73.056,\r\n" + //
                      "                \"lat\": 41.222\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Senior Accountant\",\r\n" + //
                      "            \"skills\": [\r\n" + //
                      "                \"Microsoft Excel\",\r\n" + //
                      "                \"Microsoft Office\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:01:10.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"Alinabal - Manufacturing Facilities\",\r\n" + //
                      "            \"state\": \"CT\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"100hires\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 90000,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"Senior\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"FullTime\",\r\n" + //
                      "                \"Weekdays\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Assembler\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:30:42.000Z\",\r\n" + //
                      "            \"city\": \"Grand Ledge\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Environmental\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f03d796e6cd2a3602e6f1\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"20.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"26.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"### Who We Are\\n\\nRoberts Sinto Corporation, located in Grand Ledge, MI, is part of the Sinto America Group of companies, the North American subsidiary of Sintokogio, Ltd., a worldwide organization with a global reputation for excellence in manufacturing.\\n\\nSinto America offers innovative, top-class solutions to meet the needs of our customers and industries, with operating companies dedicated to providing superior customer service through practical, cost-effective, and technologically advanced equipment and service solutions across North America.\\n\\nSinto America is comprised of seven primary segments, including Foundry Mold and Core Making, Sand Processing, Bulk Material Handling, Automation, 3D Ceramic Printing, Surface Treatment, and Surface Technologies.\\n\\nRoberts Sinto Corporation is a leading OEM designer and manufacturer of heavy industrial equipment serving foundry, surface treatment, and material handling markets. With more than 50 years of experience, we build custom machinery and systems engineered to meet demanding industrial applications.\\n\\nRoberts Sinto is currently seeking an **Industrial Machine Controls Assembler** to join our team in Grand Ledge, MI. This position focuses primarily on **wiring and assembling electrical control panels for industrial machinery in an OEM manufacturing environment**.\\n\\nWhat You Will Do\\n- ---------------\\n\\nThe Industrial Machine Controls Assembler is responsible for **building, wiring, and verifying electrical control panels** used in heavy industrial equipment. This role is hands-on and production-focused, with the majority of time spent **wiring panels, routing cables, and assembling control systems** according to prints and specifications.\\n\\n### Electrical Panel Assembly \\\\& Wiring\\n\\n* Wire and assemble industrial electrical control panels according to schematics, wiring diagrams, and bills of material\\n* Install and wire components such as PLCs, HMIs, VFDs, power supplies, relays, terminal blocks, sensors, and safety devices\\n* Route, label, and terminate wiring to OEM standards and customer specifications\\n* Perform point-to-point wiring checks and basic electrical verification\\n* Maintain neat, organized, and professional panel layouts\\n\\n### Production \\\\& Equipment Support\\n\\n* Support integration of control panels into industrial machinery\\n* Assist with machine power-up, checkout, and troubleshooting as needed\\n* Support equipment run-offs and testing activities\\n* Assist with panel or equipment modifications and rework when required\\n* Coordinate with assembly, engineering, and controls teams to resolve issues\\n\\n### Quality, Systems \\\\& Safety\\n\\n* Follow established assembly procedures, quality standards, and work instructions\\n* Ensure work complies with applicable electrical codes and internal standards\\n* Accurately complete job tracking and documentation using ERP systems (Syteline)\\n* Maintain a clean, organized, and safe work area\\n* Adhere to all safety policies and ISO quality requirements\\n\\nWhat We Want From You\\n- --------------------\\n\\n### Education \\\\& Experience\\n\\n* High school diploma or equivalent\\n* 2--5 years of experience wiring industrial control panels, preferred\\n* Experience in an **OEM manufacturing or machine-building environment** strongly preferred\\n\\n### Preferred Experience\\n\\n* Industrial controls, automation, or electrical assembly background\\n* Familiarity with PLC-based control systems and industrial automation components\\n* Experience wiring panels for custom or engineered-to-order machinery\\n\\n### Skills and Abilities\\n\\n* Ability to read and interpret electrical schematics, wiring diagrams, and layouts\\n* Strong attention to detail and workmanship quality\\n* Working knowledge of hand tools, electrical tools, and measuring devices\\n* Basic understanding of industrial electrical safety practices\\n* Ability to follow written and verbal instructions\\n* Effective communication and teamwork skills\\n* Working knowledge of basic math concepts (measurements, counts, ratios)\\n\\nPhysical Requirements\\n- --------------------\\n\\nWhile performing the duties of this job, the employee is frequently required to stand; sit; use hands to handle tools, wires, and electrical components; and talk and hear. The employee is occasionally required to walk and reach with hands and arms. The employee must be able to lift and/or move up to 50 pounds unassisted. Specific vision abilities required include close vision, depth perception, and the ability to adjust focus.\\n\\nWork Environment\\n- ---------------\\n\\nWhile performing the duties of this job, the employee will work in a manufacturing and production environment and may be exposed to moving mechanical parts, airborne particles, extremes of heat and cold, and electrical hazards. The noise level in the work environment is usually moderate.\\n\\nThe Benefits of Joining Our Team\\n- -------------------------------\\n\\nBecause we seek to hire the best people, we work hard to provide benefits that make their lives better. Our comprehensive benefits program includes:\\n\\n* Health coverage for Medical, Dental, and Vision plans\\n* 401(k) plan with generous company match and profit sharing\\n* Short-term and long-term disability, life insurance up to $50k of base salary, and AD\\\\&D insurance at 100% company cost\\n* Flexible spending accounts for healthcare and dependent care\\n* Generous paid time off that increases with tenure, plus paid sick time\\n* 100% company-paid Employee Assistance Program (EAP)\\n* Tuition reimbursement\\n\\nWhen you join Roberts Sinto, you don't just take a job---you become part of a skilled team building complex industrial machinery that drives customer success.\\n\\nYou should be proficient in:\\n\\n* Electrical Schematics\\n* 120/208/240/480 Voltage Systems\\n* Electrical / Electronic Systems\\n* High Voltage Systems\\n* Blueprint Reading\",\r\n" + //
                      "                \"industry\": \"Environmental\",\r\n" + //
                      "                \"jobBenefits\": \"Paid Holidays, Pension Plan\",\r\n" + //
                      "                \"title\": \"Industrial Machine Controls Assembler\",\r\n" + //
                      "                \"directApply\": false,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://100hires.com/j/k8nZd4y\",\r\n" + //
                      "                \"relevantOccupation\": \"Assembler\",\r\n" + //
                      "                \"skills\": [\r\n" + //
                      "                    \"Terminate\",\r\n" + //
                      "                    \"Assembly language\",\r\n" + //
                      "                    \"Blueprint\",\r\n" + //
                      "                    \"Assembler\"\r\n" + //
                      "                ],\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"5221a58fa9fb1864b509d5be\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"Sinto Industrial - USA\",\r\n" + //
                      "                    \"logo\": \"https://100hires.com/\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://sintoamerica.com\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"71de17a12dc8298aed99e594\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"48837\",\r\n" + //
                      "                        \"addressLocality\": \"Grand Ledge\",\r\n" + //
                      "                        \"addressRegion\": \"MI\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 42.753,\r\n" + //
                      "                    \"name\": \"Grand Ledge, MI, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -84.746\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"100hires_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -84.746,\r\n" + //
                      "                \"lat\": 42.753\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Industrial Machine Controls Assembler\",\r\n" + //
                      "            \"skills\": [\r\n" + //
                      "                \"Terminate\",\r\n" + //
                      "                \"Assembly language\",\r\n" + //
                      "                \"Blueprint\",\r\n" + //
                      "                \"Assembler\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:30:42.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"Sinto Industrial - USA\",\r\n" + //
                      "            \"state\": \"MI\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"100hires\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 20,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Service Technician\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:24:45.000Z\",\r\n" + //
                      "            \"city\": \"Columbus\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Automotive\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f049b96e6cd2a3602e720\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FullTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"33.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"43.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"DEUTZ is one of the world's leading manufacturers of innovative drive systems. Its core competences are the development, production, distribution and servicing of diesel, gas and electric drivetrains for professional applications that is used in construction equipment, agricultural machinery, material handling equipment, stationary equipment, commercial vehicles, rail vehicles and other applications.\\n\\n**Job Summary:**\\n\\nThe Remote Field Service Technicians are creative mechanic marvels that contribute to the organization'ssuccess by providingexpertisein field service troubleshooting, installations, and repair of our machinery. The Remote Field Service Technician will perform field-related preventative maintenance and routine repairs on all DEUTZ products and Non-DEUTZ Construction Equipmentoperatingwithin the DEUTZ Power Center. The Remote Field Service Technician will liaise with our Service Supervisor, Parts Dept, Customers, New enginesalesand engineering/warranty department. This role requires robust problem-solving skills with the ability to adapt and work in a team environment.The ideal candidate must be personable, reliable, ethical, and intelligent with a diligent and hard-working drive.\\n\\n**Essential Duties and Responsibilities**\\n\\nTheRemote Field Service Technicianwillbe responsible for, but not limited to, the following duties:\\n\\n* Travel to customer(s) locations to perform engine and equipment-related repairs.\\n\\n* Assistin resolving customer-related issuesina timelymanner.\\n\\n* Work with all employees and supervisors to ensure the facility is clean and organized and presents a positive image of DEUTZ.\\n\\n* Plan methods and sequence of performing repairs assigned.\\n\\n* Pre-order all parts and materialsrequiredto perform assigned repairs.\\n\\n* Inspect required repairs safely and effectively.\\n\\n* Ensure all repairs are completed as assigned and according to manufacturer requirements.\\n\\n* Ensure proper cosmetic appearance upon completion of repairs.\\n\\n* Ensure all parts and materials not used are returned per DEUTZ Power Center return parts guidelines.\\n\\n* Maintain and keep the work area in a clean and safe condition.\\n\\n* Communicate with customers in a respectful and honest manner.\\n\\n* Match all identified solutions necessary to affectrepair.\\n\\n* Complete all work orders and time sheetsin a timely manner.\\n\\n* Consult, when necessary, with the DEUTZ Service Department ticket system to ensure the accuracy and approval of repairs.\\n\\n* Ensure vehicle parts inventory ismaintainedat a suitable level for first-call completions and local parts sales.\\n\\n* Perform all workin accordance withall established policies and procedures.\\n\\n* Assistin the proper filing of warranty claims and customer invoices.\\n\\n* Follow all DEUTZ employee policies and procedures, especially pertaining to travel and company credit cards.\\n\\n* Maintains and cleans service trucks meeting DOT requirements.\\n\\n* Other duties as assigned.\\n\\n**Other Qualifications**\\n\\n* Strong experience in diagnosis, and repair of NG/CNG, Tier 3-4 emissions level preferred.\\n\\n* Ability to develop exceptionally strong working knowledge of DEUTZ Diesel engines.\\n\\n* Ability to work with minimal supervision.\\n\\n* Meet all local/state and company requirements tooperatea company-assigned service vehicle.\\n\\n* Excellent communication skills (writing, speaking in person, and over the phone).\\n\\n* Proficient in the use of basic computer functions and portable diagnostic tools.\\n\\n* Musthaveyour owntools. Key DEUTZ tools will be provided.\\n\\n**Supervisory Responsibility**\\n\\n* None\\n\\n**Travel Requirements**\\n\\n* Anticipated domestic and international travel is approximately 100% depending on business needs within the region.\\n\\n**MinimumRequirements**\\n\\n* High School Graduate or General Education Degree (GED)\\n\\n* Must be able tomaintainDOT medical card status\\n\\n* Must have a valid driver's license and be insurable by the company\\n\\n* 4+ years as shop technician experience or 2+ years as a field service technician\\n\\n**Preferred Requirements**\\n\\n* Two years of Diesel engine experience.\\n\\n* 2-5 years of construction equipment repair experience preferred\\n\\n* Strong computer usage with the ability to effectivelyutilizesoftware includingSerdia,Serpic,Fieldaware, Word, and Excel\\n\\n* Certification/Training in heavy equipment and diesel engine repairs preferred\\n\\n**Physical Requirements:**\\n\\nManufacturing assembly and warehouseenvironments.Subject to noise, dust, diesel fuel, oil, and extreme hot/cold temperatures. No A/C.\\n\\nThe above job description is not intended to be an all-inclusive list of duties and standards of the position. Incumbents will follow any other instructions, and perform any related duties, as assigned by their supervisor.\\n\\n\\\\*\\\\*EEO Statement \\\\*\\\\*\\n\\nDEUTZ is an equal opportunity employer and considers all applicants for employment based on merit, competence, performance, and business needs. We do not discriminate on the bases of any status protected under federal, state, or local law. Applicants will be considered regardless of their race, color, sex, gender identity or expression, age, religion, creed, national origin, citizenship status, sexual orientation, genetic information, physical or mental disability, military status or any other characteristic protected under federal, state, or local law. In addition to complying with all applicable laws, DEUTZ also has a strong corporate commitment to inclusion.\\n\\nYou should be proficient in:\\n\\n* Heavy Equipment Repair\\n* Mechanical Troubleshooting Skills\\n* Electrical Troubleshooting\\n* Lift Truck Repair \\\\& Maintenance\\n* Field Service Readiness\\n* Diesel \\\\& Heavy Equipment Systems\\n* Mechanical Systems \\\\& Component Repair\\n* Aerial \\\\& Utility Equipment Systems\\n* Equipment Repair \\\\& Maintenance\",\r\n" + //
                      "                \"industry\": \"Automotive\",\r\n" + //
                      "                \"title\": \"Remote Field Service Technician\",\r\n" + //
                      "                \"directApply\": false,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://100hires.com/j/iBT6eHR\",\r\n" + //
                      "                \"relevantOccupation\": \"Service Technician\",\r\n" + //
                      "                \"skills\": [\r\n" + //
                      "                    \"Microsoft Excel\"\r\n" + //
                      "                ],\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"fd5dad9ece01ee6017df9304\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"DEUTZ Americas\",\r\n" + //
                      "                    \"logo\": \"https://100hires.com/\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"847d657df5b894ea072d4ab6\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"43211\",\r\n" + //
                      "                        \"addressLocality\": \"Columbus\",\r\n" + //
                      "                        \"addressRegion\": \"OH\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 39.961,\r\n" + //
                      "                    \"name\": \"Columbus, OH, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -82.999\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"Hybrid, EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"100hires_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -82.999,\r\n" + //
                      "                \"lat\": 39.961\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Remote Field Service Technician\",\r\n" + //
                      "            \"skills\": [\r\n" + //
                      "                \"Microsoft Excel\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:24:45.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"DEUTZ Americas\",\r\n" + //
                      "            \"state\": \"OH\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"100hires\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"Hybrid\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 33,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Assembler\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:54:14.000Z\",\r\n" + //
                      "            \"city\": \"Alachua\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Engineering\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f04ef96e6cd2a3602e73b\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"Shift\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"18.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"24.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"We are seeking mechanically inclined Assembly Technicians for an established company in the Alachua, FL area who will perform in a heavy production environment, assembling large and heavy parts using hand tools, power tools, and other specialized equipment.\\n\\n**Candidates with automotive or complex assembly experience are encouraged to apply.**\\n\\n**Pay rate $18-$24/hr depending on experience**\\n\\n**Shift: 1st 6:30am to 3:00pm Monday to Friday**\\n\\n**Job Duties:**\\n\\nReview specifications to determine assembly and special options.\\n\\nCheck bins for adequate supplies\\n\\nEnsure connections for correct fit, parts, and sub-assemblies per specifications\\n\\nFollow detailed instructions for assembly of industrial products.\\n\\nMaintain a clean and safe work environment\\n\\n**Qualifications / Requirements:**\\n\\nExperience and ability to read blueprints preferred.\\n\\nMust be able to lift 50 lbs\\n\\nMust be able to work within a non-climate controlled environment.\\n\\nThis is a drug-free workplace. All candidates must be able to pass a pre-employment drug screen and be willing to submit to a national background check.\\n\\nYou should be proficient in:\\n\\n* Mechanical Troubleshooting Skills\\n* Electrical / Electronic Systems\\n* Mechanical Assembly Skills\\n* Low Voltage Cabling Installation\\n* Equipment Installation \\\\& Wiring\\n* Equipment Repair \\\\& Maintenance\\n* Blueprint Reading\",\r\n" + //
                      "                \"industry\": \"Engineering\",\r\n" + //
                      "                \"title\": \"Mechanical Assembler\",\r\n" + //
                      "                \"directApply\": false,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://100hires.com/j/nzQz4BZ\",\r\n" + //
                      "                \"relevantOccupation\": \"Assembler\",\r\n" + //
                      "                \"skills\": [\r\n" + //
                      "                    \"Assembly language\",\r\n" + //
                      "                    \"Blueprint\",\r\n" + //
                      "                    \"Assembler\"\r\n" + //
                      "                ],\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"5c0abd30256f81f119d02b9c\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"FastTrack Staffing\",\r\n" + //
                      "                    \"logo\": \"https://100hires.com/\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"c5cb996d78ec0e41ad64deb5\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"32615\",\r\n" + //
                      "                        \"addressLocality\": \"Alachua\",\r\n" + //
                      "                        \"addressRegion\": \"FL\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 29.79381,\r\n" + //
                      "                    \"name\": \"Alachua, FL, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -82.49442\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"100hires_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -82.49442,\r\n" + //
                      "                \"lat\": 29.79381\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Mechanical Assembler\",\r\n" + //
                      "            \"skills\": [\r\n" + //
                      "                \"Assembly language\",\r\n" + //
                      "                \"Blueprint\",\r\n" + //
                      "                \"Assembler\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:54:14.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"FastTrack Staffing\",\r\n" + //
                      "            \"state\": \"FL\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"100hires\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": true,\r\n" + //
                      "            \"minSalary\": 18,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"Shift\",\r\n" + //
                      "                \"Weekdays\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Pharmacy Executive\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Vancouver\",\r\n" + //
                      "            \"timezone\": \"PDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Trade\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f084aa0c5be5708c5fbe3\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"CAD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"18.25\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"22.09\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"CAD\",\r\n" + //
                      "                \"description\": \"Not just a job...   \\na community   \\na partnership   \\na team   \\n\\nYou'll experience them all at London Drugs. As one of Canada's fastest-growing and most successful retail chains, we know what it takes to build a satisfying career. We are seeking innovative, customer focused people to join our team! We currently have opportunities for:  \\n\\n**Pharmacy Assistant - Part Time**  \\nLondon Drugs means many things to many people. As a London Drugs Pharmacy Assistant, it means a community-oriented working environment that fosters professional excellence. Pharmacy Assistants are provided with a working environment that stresses professionalism. You will be given the tools and opportunity to practice your profession in a well designed pharmacy, which helps optimize patient care.   \\n\\nYou will be responsible for assisting the Pharmacists and Pharmacy Manager with daily operations of the Pharmacy Department. Duties will include customer service, servicing the front counter, cashier duties, telephone inquiries and general housekeeping duties. Additionally, you will operate the pharmacy computer and assist in the processing of prescriptions and preparation of prescriptions. Other responsibilities will include involvement of ordering and receiving drug orders and management of the pharmacy inventory. If you are looking for a challenging position in retail pharmacy and have the professionalism, commitment to excellence and drive to join our team, London Drugs is the place for you.  \\nThe successful candidate will have the following:\\n\\n* Good interpersonal skills when dealing with customers, staff, \\\\& management.\\n* Good communication skills, both written and verbal.\\n* Self-starter with a high level of enthusiasm.\\n* Ability to relate to all levels of customers and their needs.\\n* Ability to work quickly and accurately under pressure.\\n* Ability to work as a team player and have a team approach\\n* Basic computer skills.\\n* Previous Pharmacy experience preferable.\\n\\n**We offer advancement opportunities through our promote-from-within policies, as well as the following comprehensive benefits program. Starting pay will fall within the salary range indicated and may vary based on job-related experience, knowledge, and education:**   \\n\\n* Comprehensive medical, dental, prescription drug and vision coverage available with service for you and your family (Ensuring you and your family are taken care of)\\n* Company matched RRSPs (Helping you plan for your future)\\n* Employee Discount Program (Sharing our success)\\n* Ongoing In-House Training \\\\& Education Courses (Lifelong learning)\\n* Employee Family Assistance Program (Free confidential counselling)\\n\\nApplicants should be available to work a flexible schedule, Monday to Sunday.   \\n\\nIf you possess the necessary skills and expertise and would like to join an exciting team of professionals,   \\n\\n**Apply Now!**  \\nLondon Drugs is an equal opportunity employer dedicated to building an inclusive and diverse workforce. We are committed to building a company that represents a variety of backgrounds, perspectives, and skills. The more inclusive we are, the better our work will be.   \\n\\nWe will provide accommodations during the recruitment process upon request.   \\n\\nThe above statements are intended to describe the general nature and level of work applicable to this position and are not intended to be an exhaustive list of all responsibilities, duties and skills required. Be advised, London Drugs DOES NOT use third party recruitment services.   \\n\\nLondon Drugs may collect, use, and/or disclose your personal information (including the information in this application) where it is reasonable for establishing, managing or terminating an employment relationship. This includes the use or disclosure of your personal information to persons inside or external to our organization, for the purpose of checking references or gathering other information to support an assessment of your candidacy.  \\n\\n*To protect yourself, do not respond to unsolicited job offers from individuals or e-mail addresses, and never disclose any sensitive details about your identity (including personal or financial) to anyone you do not know or trust or on any unverified website, or website you do not trust.*\",\r\n" + //
                      "                \"industry\": \"Trade\",\r\n" + //
                      "                \"title\": \"Pharmacy Assistant - Part Time\",\r\n" + //
                      "                \"directApply\": true,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://london-drugs-limited-jobs.careerplug.com/jobs/3489701\",\r\n" + //
                      "                \"relevantOccupation\": \"Pharmacy Executive\",\r\n" + //
                      "                \"skills\": [\r\n" + //
                      "                    \"Laravel\"\r\n" + //
                      "                ],\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"986b0a7b60d2b34e8dc073f3\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"London Drugs Limited\",\r\n" + //
                      "                    \"logo\": \"https://d2zpdrfrohaf9r.cloudfront.net/system/logos/481973/original/2025-ProudlyCanadian-HeaderLogo-210x30-noBG.png?1756849585\",\r\n" + //
                      "                    \"alternateName\": \"London Drugs\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://londondrugs.com\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"4076e30bfcff11af8ff15bb8\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"Canada\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"V6E1B5\",\r\n" + //
                      "                        \"addressLocality\": \"Vancouver\",\r\n" + //
                      "                        \"addressRegion\": \"BC\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"name\": \"Vancouver, BC, CA\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\"\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"PDT Timezone\",\r\n" + //
                      "                \"sameAs\": \"https://london-drugs-limited-jobs.careerplug.com/jobs/3489701\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"careerplug_us\",\r\n" + //
                      "            \"locale\": \"en_CA\",\r\n" + //
                      "            \"title\": \"Pharmacy Assistant - Part Time\",\r\n" + //
                      "            \"skills\": [\r\n" + //
                      "                \"Laravel\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:00:00.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -7,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"London Drugs\",\r\n" + //
                      "            \"state\": \"BC\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"careerplug\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 18.25,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"FullTime\",\r\n" + //
                      "                \"PartTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"postCode\": \"V6E1B5\",\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Manager\",\r\n" + //
                      "            \"dateActive\": \"2026-08-09T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Castroville\",\r\n" + //
                      "            \"timezone\": \"PDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Services\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f0d7f543bc26b90de3a56\",\r\n" + //
                      "                \"validThrough\": \"2026-08-09\",\r\n" + //
                      "                \"employmentType\": \"FullTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"24.00\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"27.00\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"HOUR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Benefits:**\\n\\n* Health insurance\\n* Opportunity for advancement\\n* Training \\\\& development\\n* Vision insurance\\n* 401(k) matching\\n* Dental insurance  \\nSERVPRO of Monterey Peninsula is hiring a **Restoration Supervisor**!  \\n\\n**Benefits**  \\nSERVPRO of Monterey Peninsula offers:\\n\\n* Competitive compensation\\n* Superior benefits\\n* Career progression\\n* Professional development\\n\\nAnd more!  \\nAs the front-line representative of the SERVPRO® brand, the **Restoration Supervisor** demonstrates the company's Here to Help® commitment to customers and clients. This is done by coordinating, monitoring, and performing work activities on projects to successfully fulfill service needs and facilitate a positive customer experience.  \\n\\n**Key Responsibilities**\\n\\n* Coordinate and perform production processes as scheduled and ensure quality control\\n* Manage the customer and client experience and overall customer satisfaction tracked with online reviews\\n* Communicate clear expectations to restoration technicians and supervise their activities\\n* Document a detailed and accurate job file to support the services provided\\n* Manage labor and consumable item usage on assigned projects\\n* Communicate with restoration project manager and office staff on project progress and issues\\n\\n**Additional Responsibilities:**\\n\\n* Communicate and follow all OSHA guidelines for job safety\\n* Manage assets by protecting and using equipment and materials properly\\n* Coach and train restoration technicians\\n\\n**Position Requirements**\\n\\n* Valid driver's license\\n* High school diploma/GED (preferred)\\n* At least 1 year of experience in cleaning, restoration, or construction\\n* IICRC certification a plus, not required\\n\\n**Skills/Physical Demands/Competencies**\\n\\n* Ability to lift a minimum of 50 pounds regularly, occasionally up to 100 pounds with assistance\\n* Ability to climb ladders, work at ceiling heights, work in tight spaces (i.e. crawl spaces, attics)\\n* Ability to repetitively push/pull/lift/carry objects\\n* Ability to work with/around cleaning agents\\n\\nEach SERVPRO® Franchise is Independently Owned and Operated.  \\n*All employees of a SERVPRO Franchise are hired by, employed by, and under the sole supervision and control of an independently owned and operated Servpro Franchise. Servpro Franchise employees are not employed by, jointly employed by, agents of or under the supervision or control of Servpro Industries, LLC or Servpro Franchisor, LLC (the Franchisor), in any manner whatsoever. All Sample Forms provided by Servpro Industries to Servpro Franchises should be reviewed and approved by the Franchise's attorney for compliance with Federal, State and Local laws. All Sample Forms are provided for informational purposes and Servpro Franchises may choose whether or not to use them.*\",\r\n" + //
                      "                \"industry\": \"Services\",\r\n" + //
                      "                \"jobBenefits\": \"Pension Plan\",\r\n" + //
                      "                \"title\": \"Restoration Supervisor\",\r\n" + //
                      "                \"directApply\": true,\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://servpro-careers.careerplug.com/jobs/3489663\",\r\n" + //
                      "                \"relevantOccupation\": \"Manager\",\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"7f7dacae3c800b3469364821\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"SERVPRO of Monterey Peninsula\",\r\n" + //
                      "                    \"logo\": \"https://d2zpdrfrohaf9r.cloudfront.net/system/logos/519142/original/Logo_300px_wide.png?1663599356\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://servpro.com\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"13063369711df4c0a780040e\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"postalCode\": \"95012\",\r\n" + //
                      "                        \"addressLocality\": \"Castroville\",\r\n" + //
                      "                        \"addressRegion\": \"CA\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 36.76195,\r\n" + //
                      "                    \"name\": \"Castroville, CA, US\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -121.7518\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"PDT Timezone\",\r\n" + //
                      "                \"sameAs\": \"https://servpro-careers.careerplug.com/jobs/3489663\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"careerplug_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -121.7518,\r\n" + //
                      "                \"lat\": 36.76195\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Restoration Supervisor\",\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T00:00:00.000Z\",\r\n" + //
                      "            \"timezoneOffset\": -7,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"SERVPRO of Monterey Peninsula\",\r\n" + //
                      "            \"state\": \"CA\",\r\n" + //
                      "            \"isDuplicate\": true,\r\n" + //
                      "            \"portal\": \"careerplug\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"minSalary\": 24,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Technician\",\r\n" + //
                      "            \"dateActive\": \"2026-08-18T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Lawrenceville\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Healthcare\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f0d834f3fca1e7b475e10\",\r\n" + //
                      "                \"validThrough\": \"2026-08-18\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"52000\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"62400\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"YEAR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Pay:** $25--$30 per hour\\n\\n**Schedule:** Afternoon hours schedule / After‑school hours\\n\\n**Setting:** Home‑based cases / Clinic cases / Day-care cases\\n\\n**About Circle Care Services**\\n\\nCircle Care Services provides compassionate ABA therapy for children on the autism spectrum. We support our RBTs with strong supervision and clear onboarding so you can confidently apply your skills and make a real impact with the families you serve.\\n\\n**About the Role**\\n\\nAs Registered Behavior Technician (RBT), you will work one‑on‑one with children in home, school, or clinic settings, implementing ABA programs designed by a supervising BCBA.\\n\\n**Responsibilities**\\n\\n- Provide ABA therapy under BCBA supervision\\n\\n- Follow treatment and behavior intervention plans\\n\\n- Collect and track session data\\n\\n- Support skill development and promote positive behavior\\n\\n- Share progress with your clinical team   \\n\\n**Why You'll Love Working With Us**\\n\\n- Flexible scheduling\\n\\n- Supportive supervision and ongoing feedback\\n\\n- Competitive pay ($25--$30/hour)\\n\\n- Opportunities to grow in ABA and behavioral health\\n\\n**Requirements**\\n\\n**-Active RBT Certification**\\n\\n- High school diploma\\n\\n- At least 18 years old\\n\\n- Reliable transportation and valid driver's license\\n\\n- Organized, dependable, and open to feedback\\n\\n- Interest in behavioral health\",\r\n" + //
                      "                \"industry\": \"Healthcare\",\r\n" + //
                      "                \"title\": \"Registered Behavior Technician (RBT)\",\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://jobr.pro/job/42001159/registered-behavior-technician-rbt\",\r\n" + //
                      "                \"relevantOccupation\": \"Technician\",\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"3377eed3236eafdcd769a761\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"Circle Care Services\",\r\n" + //
                      "                    \"logo\": \"https://jobr.pro/icon-192.png\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://jobr.pro\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"d9ae533a974daeecb0670dac\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"addressLocality\": \"Lawrenceville\",\r\n" + //
                      "                        \"addressRegion\": \"GA\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 33.95621,\r\n" + //
                      "                    \"name\": \"Lawrenceville, GA, United States\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -83.98796\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"applicationUrl\": \"https://jobr.pro/job/42001159/registered-behavior-technician-rbt\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"techmap_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -83.98796,\r\n" + //
                      "                \"lat\": 33.95621\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Registered Behavior Technician (RBT)\",\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T02:18:31.955Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"Circle Care Services\",\r\n" + //
                      "            \"state\": \"GA\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"techmap\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"dateExpired\": \"2026-08-18T00:00:00.000Z\",\r\n" + //
                      "            \"minSalary\": 52000,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        },\r\n" + //
                      "        {\r\n" + //
                      "            \"occupation\": \"Technician\",\r\n" + //
                      "            \"dateActive\": \"2026-08-18T00:00:00.000Z\",\r\n" + //
                      "            \"city\": \"Lawrenceville\",\r\n" + //
                      "            \"timezone\": \"EDT\",\r\n" + //
                      "            \"contractType\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"language\": \"en\",\r\n" + //
                      "            \"industry\": \"Healthcare\",\r\n" + //
                      "            \"jsonLD\": {\r\n" + //
                      "                \"identifier\": \"6a4f0d834f3fca1e7b475e11\",\r\n" + //
                      "                \"validThrough\": \"2026-08-18\",\r\n" + //
                      "                \"employmentType\": \"FlexTime\",\r\n" + //
                      "                \"@type\": \"JobPosting\",\r\n" + //
                      "                \"baseSalary\": {\r\n" + //
                      "                    \"@type\": \"MonetaryAmount\",\r\n" + //
                      "                    \"currency\": \"USD\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"value\": {\r\n" + //
                      "                        \"minValue\": \"52000\",\r\n" + //
                      "                        \"@type\": \"QuantitativeValue\",\r\n" + //
                      "                        \"maxValue\": \"62400\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\",\r\n" + //
                      "                        \"unitText\": \"YEAR\"\r\n" + //
                      "                    }\r\n" + //
                      "                },\r\n" + //
                      "                \"salaryCurrency\": \"USD\",\r\n" + //
                      "                \"description\": \"**Pay:** $25--$30 per hour\\n\\n**Schedule:** Afternoon hours schedule / After‑school hours\\n\\n**Setting:** Home‑based cases / Clinic cases / Day-care cases\\n\\n**About Circle Care Services**\\n\\nCircle Care Services provides compassionate ABA therapy for children on the autism spectrum. We support our RBTs with strong supervision and clear onboarding so you can confidently apply your skills and make a real impact with the families you serve.\\n\\n**About the Role**\\n\\nAs Registered Behavior Technician (RBT), you will work one‑on‑one with children in home, school, or clinic settings, implementing ABA programs designed by a supervising BCBA.\\n\\n**Responsibilities**\\n\\n- Provide ABA therapy under BCBA supervision\\n\\n- Follow treatment and behavior intervention plans\\n\\n- Collect and track session data\\n\\n- Support skill development and promote positive behavior\\n\\n- Share progress with your clinical team   \\n\\n**Why You'll Love Working With Us**\\n\\n- Flexible scheduling\\n\\n- Supportive supervision and ongoing feedback\\n\\n- Competitive pay ($25--$30/hour)\\n\\n- Opportunities to grow in ABA and behavioral health\\n\\n**Requirements**\\n\\n**-Active RBT Certification**\\n\\n- High school diploma\\n\\n- At least 18 years old\\n\\n- Reliable transportation and valid driver's license\\n\\n- Organized, dependable, and open to feedback\\n\\n- Interest in behavioral health\",\r\n" + //
                      "                \"industry\": \"Healthcare\",\r\n" + //
                      "                \"title\": \"Registered Behavior Technician (RBT)\",\r\n" + //
                      "                \"@context\": \"https://schema.org\",\r\n" + //
                      "                \"url\": \"https://jobr.pro/job/42001159/registered-behavior-technician-rbt\",\r\n" + //
                      "                \"relevantOccupation\": \"Technician\",\r\n" + //
                      "                \"hiringOrganization\": {\r\n" + //
                      "                    \"identifier\": \"3377eed3236eafdcd769a761\",\r\n" + //
                      "                    \"@type\": \"Organization\",\r\n" + //
                      "                    \"name\": \"Circle Care Services\",\r\n" + //
                      "                    \"logo\": \"https://jobr.pro/icon-192.png\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"url\": \"https://jobr.pro\"\r\n" + //
                      "                },\r\n" + //
                      "                \"jobLocation\": {\r\n" + //
                      "                    \"identifier\": \"d9ae533a974daeecb0670dac\",\r\n" + //
                      "                    \"address\": {\r\n" + //
                      "                        \"addressCountry\": \"United States\",\r\n" + //
                      "                        \"@type\": \"PostalAddress\",\r\n" + //
                      "                        \"addressLocality\": \"Lawrenceville\",\r\n" + //
                      "                        \"addressRegion\": \"GA\",\r\n" + //
                      "                        \"@context\": \"https://schema.org\"\r\n" + //
                      "                    },\r\n" + //
                      "                    \"@type\": \"Place\",\r\n" + //
                      "                    \"latitude\": 33.95621,\r\n" + //
                      "                    \"name\": \"Lawrenceville, GA, United States\",\r\n" + //
                      "                    \"@context\": \"https://schema.org\",\r\n" + //
                      "                    \"longitude\": -83.98796\r\n" + //
                      "                },\r\n" + //
                      "                \"employmentUnit\": \"N/A\",\r\n" + //
                      "                \"applicationUrl\": \"https://jobr.pro/job/42001159/registered-behavior-technician-rbt\",\r\n" + //
                      "                \"datePosted\": \"2026-07-09\",\r\n" + //
                      "                \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                      "            },\r\n" + //
                      "            \"source\": \"techmap_us\",\r\n" + //
                      "            \"locale\": \"en_US\",\r\n" + //
                      "            \"geoPoint\": {\r\n" + //
                      "                \"lon\": -83.98796,\r\n" + //
                      "                \"lat\": 33.95621\r\n" + //
                      "            },\r\n" + //
                      "            \"title\": \"Registered Behavior Technician (RBT)\",\r\n" + //
                      "            \"dateCreated\": \"2026-07-09T02:18:31.955Z\",\r\n" + //
                      "            \"timezoneOffset\": -4,\r\n" + //
                      "            \"countryCode\": \"us\",\r\n" + //
                      "            \"company\": \"Circle Care Services\",\r\n" + //
                      "            \"state\": \"GA\",\r\n" + //
                      "            \"isDuplicate\": false,\r\n" + //
                      "            \"portal\": \"techmap\",\r\n" + //
                      "            \"department\": \"N/A\",\r\n" + //
                      "            \"workPlace\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isRecruiter\": false,\r\n" + //
                      "            \"dateExpired\": \"2026-08-18T00:00:00.000Z\",\r\n" + //
                      "            \"minSalary\": 52000,\r\n" + //
                      "            \"hasSalary\": true,\r\n" + //
                      "            \"careerLevel\": [\r\n" + //
                      "                \"N/A\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"workType\": [\r\n" + //
                      "                \"FlexTime\",\r\n" + //
                      "                \"FullTime\"\r\n" + //
                      "            ],\r\n" + //
                      "            \"isDirect\": true\r\n" + //
                      "        }\r\n" + //
                      "    ],\r\n" + //
                      "    \"resultSizeInBytes\": 52644\r\n" + //
                      "}";
    }
}
