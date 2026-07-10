package com.job_intel.backend;

public class JsonEx {
    public static String jsonTemp(){
       return "{\r\n" + //
                        "  \"api\": \"Techmap.io Job Posting API\",\r\n" + //
                        "  \"apiVersion\": \"v2.6\",\r\n" + //
                        "  \"apiEndpoint\": \"GET search result for Job Postings by countryCode, dateCreated, language, industry, timezone, workPlace, etc.\",\r\n" + //
                        "  \"page\": 1,\r\n" + //
                        "  \"pageSize\": 10,\r\n" + //
                        "  \"totalCount\": 683,\r\n" + //
                        "  \"query\": {\r\n" + //
                        "    \"query\": {\r\n" + //
                        "      \"bool\": {\r\n" + //
                        "        \"must\": [\r\n" + //
                        "          {\r\n" + //
                        "            \"range\": {\r\n" + //
                        "              \"dateCreated\": {\r\n" + //
                        "                \"gte\": \"2026-07-05T00:00:00.000Z\",\r\n" + //
                        "                \"lte\": \"2026-07-05T23:59:59.999Z\"\r\n" + //
                        "              }\r\n" + //
                        "            }\r\n" + //
                        "          },\r\n" + //
                        "          {\r\n" + //
                        "            \"term\": {\r\n" + //
                        "              \"hasSalary\": true\r\n" + //
                        "            }\r\n" + //
                        "          },\r\n" + //
                        "          {\r\n" + //
                        "            \"match\": {\r\n" + //
                        "              \"countryCode\": \"us\"\r\n" + //
                        "            }\r\n" + //
                        "          }\r\n" + //
                        "        ]\r\n" + //
                        "      }\r\n" + //
                        "    }\r\n" + //
                        "  },\r\n" + //
                        "  \"result\": [\r\n" + //
                        "    {\r\n" + //
                        "      \"occupation\": \"Nurse\",\r\n" + //
                        "      \"dateActive\": \"2026-08-04T00:29:25.260Z\",\r\n" + //
                        "      \"city\": \"Wessington\",\r\n" + //
                        "      \"timezone\": \"CDT\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Education\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49adfcdb987454fd6f1f53\",\r\n" + //
                        "        \"validThrough\": \"2026-08-04T00:29:25.26Z\",\r\n" + //
                        "        \"employmentType\": \"Shift\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"32.00\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"48.00\",\r\n" + //
                        "            \"@context\": \"https://schema.org\",\r\n" + //
                        "            \"unitText\": \"YEAR\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"description\": \"**Careers With Purpose**   \\n\\n**Join our not-for-profit organization that has provided over 100 years of housing and services to seniors with a commitment to quality care and service in a Christian environment.**   \\n\\n**Facility:** GSS SD Miller Prairie Ctr   \\n\\n**Location:** Miller, SD   \\n\\n**Address:** 421 E 4th St, Miller, SD 57362, USA   \\n\\n**Shift:** 12 Hours - Day Shifts   \\n\\n**Job Schedule:** PRN   \\n\\n**Weekly Hours:** Varies   \\n\\n**Salary Range:** $32.00 - $48.00   \\n\\n**Pay Info:** $5,000.00 Sign on Bonus Eligible!   \\n\\n**Job Summary**   \\n\\nThe Registered Nurse (RN) is responsible for utilizing the nursing process (assessment, diagnosis, outcomes/planning, implementation and evaluation) to provide individualized nursing care to residents. Collaborates with resident and family, other inter-disciplinary colleagues, including providers, to plan, implement and evaluate care. Demonstrates competency and practices within the full scope of nursing expertise/knowledge and utilizes appropriate age and population specific standards as designated in their assigned clinical setting. Cares for residents in all phases of preventative care, health maintenance, diagnosis, and treatment. Responsible for the coordination of care, resident assessment, resident education and various other nursing interventions.   \\n\\nMay serve as charge nurse and delegate appropriate tasks to license and unlicensed assistive personnel that are within the job descriptions, skills, resident care needs, and the competence level of the delegate. Provides adequate assistance and support to delegates to ensure safe, reliable administration of resident care and resolution of care and service concerns. Functions within the scopes and standards of nursing practice as outlined in the Nurse Practice Act and Administrative Rules in state of practice and licensure. The Professional Nursing Practice recognizes the Scope and Standards of Practice and the Code of Ethics for Nurses with Interpretive Statements as published by the American Nurses Association as the foundation of nursing care delivery and professional conduct.   \\n\\n**Qualifications**   \\n\\nGraduate from a nationally accredited nursing program preferred, including, but not limited to, Commission on Collegiate Nursing Education (CCNE), Accreditation Commission for Education in Nursing (ACEN), and National League for Nursing Commission for Nursing Education Accreditation (NLN CNEA). Bachelor's Degree in nursing preferred.   \\n\\nCurrently holds an unencumbered RN license with the State Board of Nursing where the practice of nursing is occurring and/or possess multistate licensure if in a Nurse Licensure Compact (NLC) state. Obtains and subsequently maintains required department specific competencies and certifications.   \\n\\n**Benefits**   \\n\\nGood Samaritan offers an attractive benefits package for qualifying Full time and part-time employees. Depending on eligibility, a variety of benefits include health insurance, dental insurance, vision insurance, life insurance, a 401(k) retirement plan, work/life balance benefits, and a generous time off package to maintain a healthy home-work balance. For more information about Total Rewards, visit https://sanfordcareers.com/benefits .   \\n\\nGood Samaritan is an EEO/AA Employer M/F/Disability/Vet. If you are an individual with a disability and would like to request an accommodation for help with your online application, please call 1-877-673-0854 or send an email to (see below)   \\n\\nGood Samaritan has a Drug Free Workplace Policy. An accepted offer will require a drug screen and pre-employment background screening as a condition of employment.   \\n\\n**Req Number:** R-0265794   \\n\\n**Job Function:** Nursing   \\n\\n**Featured:** No\",\r\n" + //
                        "        \"industry\": \"Education\",\r\n" + //
                        "        \"jobBenefits\": \"Pension Plan\",\r\n" + //
                        "        \"title\": \"RN-Registered Nurse - PRN - Days\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://find.jobs/jobs-near-me/rn-registered-nurse-prn-days-wessington-south-dakota/2858787011-2/\",\r\n" + //
                        "        \"relevantOccupation\": \"Nurse\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"Citrine\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"14e2a3bc285143a1c394f6fb\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"Good Samaritan\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"url\": \"https://find.jobs\"\r\n" + //
                        "        },\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"9e346ca2cd616afd60d81d3e\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"postalCode\": \"57381\",\r\n" + //
                        "            \"addressLocality\": \"Wessington\",\r\n" + //
                        "            \"addressRegion\": \"South Dakota\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"latitude\": 44.45415,\r\n" + //
                        "          \"name\": \"57381 Wessington, South Dakota, United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"longitude\": -98.69704\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"N/A\",\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"CDT Timezone\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"techmap_us\",\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"geoPoint\": {\r\n" + //
                        "        \"lon\": -98.69704,\r\n" + //
                        "        \"lat\": 44.45415\r\n" + //
                        "      },\r\n" + //
                        "      \"title\": \"RN-Registered Nurse - PRN - Days\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"Citrine\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T00:29:25.260Z\",\r\n" + //
                        "      \"timezoneOffset\": -5,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"company\": \"Good Samaritan\",\r\n" + //
                        "      \"state\": \"South Dakota\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"techmap\",\r\n" + //
                        "      \"department\": \"N/A\",\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"dateExpired\": \"2026-08-04T00:29:25.260Z\",\r\n" + //
                        "      \"minSalary\": 32,\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FullTime\",\r\n" + //
                        "        \"PartTime\",\r\n" + //
                        "        \"Shift\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"postCode\": \"57381\",\r\n" + //
                        "      \"isDirect\": true\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"occupation\": \"Intelligence Manager\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:47:08.221693Z\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Environmental\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49b79cfcdf8f0bb8c03fb2\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FlexTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"145000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"155000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"DNSFilter's mission is to protect our customers and partners with products they love to use! We are revolutionizing network security by providing fast, accurate, and reliable threat protection and content filtering. We're a rapidly growing company dedicated to creating a safer internet for businesses and organizations worldwide. Leveraging AI-driven threat intelligence, DNSFilter empowers our customers to proactively block threats before they impact their networks. We foster a collaborative, innovative, and results-oriented culture where every team member contributes to our mission of making the internet safer.\\n\\nAs we continue our product-fueled growth by adding new features and broadening our solution to meet the needs of the global market, it's clear there's a missing piece. That's where you come in!\\n\\n**We are looking for a Product Marketing \\\\& Competitive Intelligence Manager to serve as the engine room of our product marketing team. This is a hands-on execution role with a clear growth path. You will work directly with the Director, Product Marketing \\\\& Competitive Intelligence, to ship the work that moves the pipeline, equips our sellers, and keeps DNSFilter ahead of every competitor in our space. We are looking for someone who is energized by execution---someone who wants to write the battlecard, build the launch, run the competitive teardown, and see their work show up in real deals. You will lead projects, not people, and you will be measured on what you ship and the impact it creates. This role reports to the Director, Product Marketing \\\\& Competitive Intelligence.**\\n\\n**Eligible candidates have and can work successfully in a small to mid-sized fast-paced, hyper-growth, SaaS start-up or scale-up.**   \\n\\n**This is a full-time role with a preference for candidates on the East Coast of North America or in the United Kingdom.**\\n\\nWe recognize that people come with a wealth of experience and talent beyond just the technical requirements of a job. If you feel like this job is for you, please apply. We believe diversity of experience and skills, including transferable skills, combined with passion, is a key to innovation and excellence; therefore, we encourage people from all backgrounds to apply to our positions!\\n\\n**In this role, you will:**\\n\\n* Run the daily heartbeat of our competitive intelligence function. Track competitors in depth. Build and maintain battlecards, solution briefs, and sales assets. Produce win and loss insights. Analyze pricing and packaging moves. Work closely with Sales Engineers and sellers to have the most up-to-date intel.\\n* Support and lead launches for new features and capabilities. Build launch plans, write first-draft narratives, coordinate cross-functional inputs, and own the launch checklist from kickoff to retro.\\n* Help shape and maintain the positioning and messaging across the DNSFilter portfolio. Translate product capabilities into customer language. Make sure the story is consistent across the web, sales decks, and partner assets.\\n* Build the assets and tools Sales and Channel teams use to win---pitch decks, demo scripts, objection handling guides, ROI tools, and discovery frameworks. Sit in on calls. Learn what works. Iterate fast.\\n* Use AI tooling daily to accelerate competitive research, draft assets, summarize calls, scan the market, prototype messaging, and analyze customer signals. AI is not a side experiment in this role---it is core to how the function operates.\\n* Help run a steady cadence of customer interviews, win and loss conversations, analyst inputs, and field signal collection. Turn what you hear into sharper positioning, stronger launches, and better product decisions.\\n* Operate as a trusted partner to Product, Sales, and Marketing peers. Bring clarity. Move work forward. Be the person teammates want to be in a room with.\\n* Travel 10-15% of the year for company events\\n\\n**To qualify for this role, you have:**\\n\\n* 4+ years of professional experience inside the cybersecurity industry. This is a hard requirement. We need someone who already knows the threat landscape, the buyer, and the competitive set.\\n* Direct experience in product marketing or competitive intelligence, ideally in a B2B SaaS or cybersecurity environment.\\n* Practical, hands-on experience using AI tools to accelerate marketing workflows. You can describe specific workflows you have rebuilt with AI and the leverage you generated. AI is *not* a nice-to-have in this role---it is core to how the function operates.\\n* Comfortable working closely with Sales and Product teams in a high-growth environment.\\n* Comfort being coached and are coachable. You want to grow, you take feedback well, and you act on it quickly.\\n* Ability to travel 10-15% of the year for company events\\n* Ability to work hours overlapping with ET hours\\n* Must be eligible to work in the region of hire without sponsorship from an employer now and/or in the future\\n\\n**Bonus points for:**\\n\\n* You have already built battlecards, run a launch, or written positioning that sellers actually used.\\n* Experience working closely with Sales Engineers on competitive intelligence and field-ready assets.\\n\\n**We Offer:**\\n\\n* Pathway to promotion to additional organizational positions and responsibilities based upon results and performance, not just time in the chair. You help us grow, and we will help you grow.\\n* Passionate and intelligent colleagues who work hard and have a good time doing it\\n* Paid company-wide week off at the end of each year\\n* Flexible Vacation Policy\\n* Awesome company swag\\n* Full medical, dental, and vision benefits for US, UK, and Canada-based employees\\n* Full short-term disability and life benefits; available long-term disability\\n* Retirement savings account options with vested company matching for qualifying employees\\n* In-person annual gatherings. Last time we all spent a week on a beach in the Dominican Republic!\\n\\n*DNSFilter is a pay-for-performance organization, which means there is an opportunity to advance your compensation based on performance over time. The hiring base pay is dependent on several factors, including level, function, training, transferable skills, work experience, business needs, and geographic location. As a hybrid company, our compensation reflects the cost of labor across several U.S. and global geographic markets. We pay differently based on those defined markets. Our Talent Team can share more about the specific salary range for the job location during the hiring process.*\\n\\n*DNSFilter participates in the E-Verify program.*\\n\\n*At DNSFilter, we utilize sophisticated software and tools to identify and eliminate Deepfake candidates. This approach helps us maintain the integrity of our hiring process, ensuring that we select the most qualified and genuine individuals to join our team.*  \\nU.S. hiring salary range  \\n$145,000---$155,000 USD\",\r\n" + //
                        "        \"industry\": \"Environmental\",\r\n" + //
                        "        \"jobBenefits\": \"Team Events\",\r\n" + //
                        "        \"title\": \"Product Marketing & Competitive Intelligence Manager\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://boards.greenhouse.io/dnsfilter/jobs/5145558007?gh_jid=5145558007\",\r\n" + //
                        "        \"relevantOccupation\": \"Intelligence Manager\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"MS-DOS\",\r\n" + //
                        "          \"Linux-HA\",\r\n" + //
                        "          \"Iteration\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"1214ca9d455860a54f99bdf0\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"DNSFilter\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"Marketing\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"579e8434e0484489cffe265b\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"name\": \"United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"minSalary\": 145000,\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"title\": \"Product Marketing & Competitive Intelligence Manager\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"MS-DOS\",\r\n" + //
                        "        \"Linux-HA\",\r\n" + //
                        "        \"Iteration\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:47:08.221693Z\",\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FlexTime\",\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"company\": \"DNSFilter\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"Marketing\",\r\n" + //
                        "      \"isDirect\": true,\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"occupation\": \"Full Stack Programmer\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:47:08.771994Z\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Engineering\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49b79cfcdf8f0bb8c03fb3\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FlexTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"125000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"135000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"DNSFilter's mission is to protect our customers and partners with products they love to use! We are revolutionizing network security by providing fast, accurate, and reliable threat protection and content filtering. We're a rapidly growing company dedicated to creating a safer internet for businesses and organizations worldwide. Leveraging AI-driven threat intelligence, DNSFilter empowers our customers to proactively block threats before they impact their networks. We foster a collaborative, innovative, and results-oriented culture where every team member contributes to our mission of making the internet safer.\\n\\nAs we continue our product-fueled growth by adding new features and broadening our solution to meet the needs of the global market, it's clear there's a missing piece. That's where you come in!\\n\\n**We are looking for a full-stack software engineer specializing in React and NextJS development. As a full-stack software engineer, you will work closely with our Engineering Organization team to modernize our application and convert it to our new design system. We're looking for someone with a track record of delivering high-quality code who can work effectively in a fully remote environment. We are following lean development practices, focusing on delivering quality products in a timely manner.**   \\n\\n**Eligible candidates have and can work successfully in a small to mid-sized fast-paced, hyper-growth, SaaS start-up or scale-up. This is a full-time role with a preference for candidates in Tampa, Florida.**   \\n\\nWe recognize that people come with a wealth of experience and talent beyond just the technical requirements of a job. If you feel like this job is for you, please apply. We believe diversity of experience and skills, including transferable skills, combined with passion, is a key to innovation and excellence; therefore, we encourage people from all backgrounds to apply to our positions!\\n\\n**At DNSFilter, you will:**\\n\\n* Be a member of our Engineering organization working on the front and back end of our software application (Ruby, Golang, React, NextJS, MUI, .NET)\\n* Work closely with other engineers, the UX team, and other stakeholders to build modularized solutions using our new design system\\n* Deliver real business value to our customer base\\n* Expand your knowledge on all technologies within our ecosystem\\n* Use AI to accelerate your learning and productivity, and an advocate for AI throughout the department\\n\\n**To qualify for this role, you have:**\\n\\n* 5 years of experience working Ruby and/or Golang\\n* 2 years of experience developing and maintaining JavaScript, React and Redux code\\n* Experience building microservices or RESTful API's\\n* Experience building reusable components\\n* Proven ability to leverage AI tools (e.g., GitHub Copilot, Claude Code, LLMs) to accelerate coding, debugging, and unit test generation while maintaining high standards for security and performance\\n* Experience integrating AI into the broader SDLC---including documentation, PR summaries, and architectural prototyping---to significantly reduce \\\"time to context\\\" and repetitive overhead\\n* Maintains a \\\"human-in-the-loop\\\" approach to critically audit AI-generated outputs for hallucinations and suboptimal patterns, while mentoring others on responsible AI usage\\n* Experience using React Query to optimize searches and cache data\\n* Attention to detail while converting UX designs to a working application\\n* You will have an API-first mindset, developing components and services that are consumed via interfaces and API contracts\\n* Experience with PostgreSQL, Redis, Kafka, ClickHouse, and other data stores\\n* Working knowledge of AWS and EKS\\n* Experience working remotely under minimal supervision\\n* The ability to keep work hours that mostly overlap with 8:00 AM - 5:00 PM Eastern Timezone, M-F\\n\\n**Bonus points for:**\\n\\n* Knowledge or experience with other programming languages, specifically TypeScript, Next.js\\n* Knowledge of feature flag management tools such as LaunchDarkly\\n* Experience working with multiple distributed/global teams\\n* Experience building a security product\\n* Excellent documentation skills in and out of code\\n* Awareness of AppSec, OSS licensing, and security tools\\n* An understanding of computer networking protocols and DNS\\n\\n**We Offer:**\\n\\n* Pathway to promotion to additional organizational positions and responsibilities based upon results and performance, not just time in the chair. You help us grow, and we will help you grow.\\n* Passionate and intelligent colleagues who work hard and have a good time doing it\\n* Paid company-wide week off at the end of each year\\n* Flexible Vacation Policy\\n* Awesome company swag\\n* Full medical, dental, and vision benefits for US, UK, and Canada-based employees\\n* Full short-term disability and life benefits; available long-term disability\\n* Retirement savings account options with vested company matching for qualifying employees\\n* In-person annual gatherings. Last time we all spent a week on a beach in the Dominican Republic!\\n\\n*DNSFilter is a pay-for-performance organization, which means there is an opportunity to advance your compensation based on performance over time. The hiring base pay is dependent on several factors, including level, function, training, transferable skills, work experience, business needs, and geographic location. As a hybrid company, our compensation reflects the cost of labor across several U.S. and global geographic markets. We pay differently based on those defined markets. Our Talent Team can share more about the specific salary range for the job location during the hiring process.*\\n\\n*DNSFilter participates in the E-Verify program.*\\n\\n*At DNSFilter, we utilize sophisticated software and tools to identify and eliminate Deepfake candidates. This approach helps us maintain the integrity of our hiring process, ensuring that we select the most qualified and genuine individuals to join our team.*  \\nU.S. hiring salary range  \\n$125,000---$135,000 USD\",\r\n" + //
                        "        \"industry\": \"Engineering\",\r\n" + //
                        "        \"title\": \"Senior Full-Stack Software Engineer\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://boards.greenhouse.io/dnsfilter/jobs/5116133007?gh_jid=5116133007\",\r\n" + //
                        "        \"relevantOccupation\": \"Full Stack Programmer\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"ReactOS\",\r\n" + //
                        "          \"Coding\",\r\n" + //
                        "          \"ClickHouse\",\r\n" + //
                        "          \"Apache Kafka\",\r\n" + //
                        "          \"MS-DOS\",\r\n" + //
                        "          \"Scigress\",\r\n" + //
                        "          \"Redux\",\r\n" + //
                        "          \"Redis\",\r\n" + //
                        "          \"Typescript\",\r\n" + //
                        "          \"JavaScript\",\r\n" + //
                        "          \"Postgresql\",\r\n" + //
                        "          \"Unit Testing\",\r\n" + //
                        "          \"InterSystems Caché\",\r\n" + //
                        "          \"Debugger\",\r\n" + //
                        "          \"Ruby\",\r\n" + //
                        "          \"AWS\",\r\n" + //
                        "          \"Github\",\r\n" + //
                        "          \"React.js\",\r\n" + //
                        "          \"Debugging\",\r\n" + //
                        "          \"Multilingual User Interface\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"1214ca9d455860a54f99bdf0\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"DNSFilter\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"N/A\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"579e8434e0484489cffe265b\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"name\": \"United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"Remote\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"minSalary\": 125000,\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"title\": \"Senior Full-Stack Software Engineer\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"ReactOS\",\r\n" + //
                        "        \"Coding\",\r\n" + //
                        "        \"ClickHouse\",\r\n" + //
                        "        \"Apache Kafka\",\r\n" + //
                        "        \"MS-DOS\",\r\n" + //
                        "        \"Scigress\",\r\n" + //
                        "        \"Redux\",\r\n" + //
                        "        \"Redis\",\r\n" + //
                        "        \"Typescript\",\r\n" + //
                        "        \"JavaScript\",\r\n" + //
                        "        \"Postgresql\",\r\n" + //
                        "        \"Unit Testing\",\r\n" + //
                        "        \"InterSystems Caché\",\r\n" + //
                        "        \"Debugger\",\r\n" + //
                        "        \"Ruby\",\r\n" + //
                        "        \"AWS\",\r\n" + //
                        "        \"Github\",\r\n" + //
                        "        \"React.js\",\r\n" + //
                        "        \"Debugging\",\r\n" + //
                        "        \"Multilingual User Interface\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:47:08.771994Z\",\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"Senior\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FlexTime\",\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"company\": \"DNSFilter\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"N/A\",\r\n" + //
                        "      \"isDirect\": true,\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"Remote\"\r\n" + //
                        "      ]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"occupation\": \"Client Manager\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:47:09.633393Z\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Environmental\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49b79dfcdf8f0bb8c03fb4\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FlexTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"90000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"100000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"DNSFilter's mission is to protect our customers and partners with products they love to use! We are revolutionizing network security by providing fast, accurate, and reliable threat protection and content filtering. We're a rapidly growing company dedicated to creating a safer internet for businesses and organizations worldwide. Leveraging AI-driven threat intelligence, DNSFilter empowers our customers to proactively block threats before they impact their networks. We foster a collaborative, innovative, and results-oriented culture where every team member contributes to our mission of making the internet safer.\\n\\nAs we continue our product-fueled growth by adding new features and broadening our solution to meet the needs of the global market, it's clear there's a missing piece. That's where you come in!\\n\\n**We are looking for Strategic Channel Account Managers who will be responsible for developing and growing deep, revenue-generating relationships with our most important strategic partners, such as SHI and Guidepoint. Rather than focusing on recruiting new resellers, this role is about investing in a select set of high-impact partners --- driving joint go-to-market execution, enabling their sales teams, building executive alignment, and expanding DNSFilter's footprint through their customer base. Since the DNSFilter Reseller Program went live in January 2024, we have established a foundation of partners, and the next phase requires a dedicated, persistent focus on maturing these strategic relationships and documenting measurable progress against joint business plans.**   \\n\\n**We are seeking candidates who enjoy a remote work environment and look forward to a fast-paced, hyper-growth SaaS organization. This is a full-time remote role and is open to candidates in the United States and Canada, with a preference for candidates located in the New Jersey area.**\\n\\nWe recognize that people come with a wealth of experience and talent beyond just the technical requirements of a job. If you feel like this job is for you, please apply. We believe diversity of experience and skills, including transferable skills, combined with passion, is a key to innovation and excellence; therefore, we encourage people from all backgrounds to apply to our positions!\\n\\n**In this role, you will:**\\n\\n* Demonstrate a deep understanding of the channel sales process to build out a new pipeline via channel-sourced opportunities, creating incentive programs, and collaboratively communicating with DNSFilter's sales team\\n* Thrive in an independent work environment; however, for this individual to succeed, they must be capable of working within a dynamic and highly distributed team environment that is entirely remote\\n* Deliver consistent sales training and coordinate technical training across Resellers and Distributors of DNSFilter\\n* Participate in channel marketing planning, budget management, and knowledge of partners' marketing and enablement programs\\n* Leverage prior experience creating campaigns, promotions, and field events to drive channel-sourced pipeline\\n* Attend channel partner locations and support partner and industry conferences in the United States and Canada\\n* Work with the Sales organization to do account mapping with key channel partners\\n\\n**To qualify for this role, you have:**\\n\\n* Must be able to travel 50% of the time or more within the United States and Canada for industry conferences/events/channel partner locations, with an updated passport and no travel restrictions.\\n* Must be eligible to work without sponsorship now and in the future.\\n* 8+ years of Channel Account Manager experience pertaining to Reseller and Distributor accounts. Specific experience with SHI, Guidepoint, and Climb would be preferred.\\n* Previous successful experience working in a remote environment.\\n* SaaS experience, an understanding of IT-related / Network infrastructure business, and experience developing and proposing appropriate solutions.\\n* IT infrastructure experience\\n* Successful track record in meeting and exceeding monthly, quarterly, and annual quotas, and increasing opportunity generation (deal registrations) with channel partners working alongside a direct sales team.\\n* Strong appetite to make outbound phone calls and travel to create rapport with channel partners and build mindshare for the partner program.\\n* Prior working relationships and demonstrated ability to launch new vendors with channel partners.\\n\\n**Bonus points for:**\\n\\n* Working knowledge of the cybersecurity market is highly desirable.\\n* Existing relationships at both SHI and Guidepoint.\\n\\n**We Offer:**\\n\\n* Pathway to promotion to additional organizational positions and responsibilities based upon results and performance, not just time in the chair. You help us grow, and we will help you grow.\\n* Passionate and intelligent colleagues who work hard and have a good time doing it\\n* Paid company-wide week off at the end of each year\\n* Flexible Vacation Policy\\n* Awesome company swag\\n* Full medical, dental, and vision benefits for US, UK, and Canada-based employees\\n* Full short-term disability and life benefits; available long-term disability\\n* Retirement savings account options with vested company matching for qualifying employees\\n* In-person annual gatherings. Last time we all spent a week on a beach in the Dominican Republic!\\n\\n*DNSFilter is a pay-for-performance organization, which means there is an opportunity to advance your compensation based on performance over time. The hiring base pay is dependent on several factors, including level, function, training, transferable skills, work experience, business needs, and geographic location. As a hybrid company, our compensation reflects the cost of labor across several U.S. and global geographic markets. We pay differently based on those defined markets. Our Talent Team can share more about the specific salary range for the job location during the hiring process.*\\n\\n*DNSFilter participates in the E-Verify program.*\\n\\n*At DNSFilter, we utilize sophisticated software and tools to identify and eliminate Deepfake candidates. This approach helps us maintain the integrity of our hiring process, ensuring that we select the most qualified and genuine individuals to join our team.* **The OTE for this role is $170-180k**  \\nU.S. hiring salary range  \\n$90,000---$100,000 USD\",\r\n" + //
                        "        \"industry\": \"Environmental\",\r\n" + //
                        "        \"title\": \"Strategic Channel Account Manager\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://boards.greenhouse.io/dnsfilter/jobs/5117739007?gh_jid=5117739007\",\r\n" + //
                        "        \"relevantOccupation\": \"Client Manager\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"MS-DOS\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"1214ca9d455860a54f99bdf0\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"DNSFilter\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"Sales\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"579e8434e0484489cffe265b\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"name\": \"United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"Remote\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"minSalary\": 90000,\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"title\": \"Strategic Channel Account Manager\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"MS-DOS\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:47:09.633393Z\",\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FlexTime\",\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"company\": \"DNSFilter\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"Sales\",\r\n" + //
                        "      \"isDirect\": true,\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"Remote\"\r\n" + //
                        "      ]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"occupation\": \"Manager\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:47:09.812748Z\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Construction\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49b79dfcdf8f0bb8c03fb5\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FlexTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"180000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"210000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"DNSFilter's mission is to protect our customers and partners with products they love to use! We are revolutionizing network security by providing fast, accurate, and reliable threat protection and content filtering. We're a rapidly growing company dedicated to creating a safer internet for businesses and organizations worldwide. Leveraging AI-driven threat intelligence, DNSFilter empowers our customers to proactively block threats before they impact their networks. We foster a collaborative, innovative, and results-oriented culture where every team member contributes to our mission of making the internet safer.\\n\\nAs we continue our product-fueled growth by adding new features and broadening our solution to meet the needs of the global market, it's clear there's a missing piece. That's where you come in!\\n\\n**We are looking for a Director, Product Marketing \\\\& Competitive Intelligence to own how DNSFilter is positioned in the market, how our products are launched, how our sellers compete, and how we read the competitive landscape. This is not a steady-state management role. We are looking for a proactive, energized, industrious product marketing leader who treats positioning as a competitive weapon, treats competitive intelligence as a daily discipline, and treats AI as a force multiplier on every single workstream. You will be both player and coach---some days you will set strategy and direct your team, other days you will write the battlecard, build the launch narrative, brief an analyst, or rebuild a pricing page yourself. You will lead one direct report, the Senior Product Marketing \\\\& Competitive Intelligence Manager, and report to the Director, Content Marketing.**\\n\\n**Eligible candidates have and can work successfully in a small to mid-sized fast-paced, hyper-growth, SaaS start-up or scale-up.\\nThis is a full-time role with a preference for candidates on the East Coast of North America or in the United Kingdom.**\\n\\nWe recognize that people come with a wealth of experience and talent beyond just the technical requirements of a job. If you feel like this job is for you, please apply. We believe diversity of experience and skills, including transferable skills, combined with passion, is a key to innovation and excellence; therefore, we encourage people from all backgrounds to apply to our positions!\\n\\n**In this role, you will:**\\n\\n* Own the positioning, messaging, and narrative architecture for the DNSFilter portfolio across MSP, VAR, and Enterprise audiences. Define who we are, who we are for, why we win, and why it matters. Make sure the story appears consistently across every customer-facing surface.\\n* Lead end-to-end launches for new features, capabilities, and products. Build the launch plan, write the core narrative, coordinate cross-functional teams, schedule training as needed, and measure the results. Hold the bar on launch quality.\\n* Build and run a competitive intelligence function that gives Sales, Product, and Leadership a real edge. Track competitors in depth. Produce battlecards, win and loss insights, pricing teardowns, and field-ready talking points. Make sure every seller knows how to beat every competitor on every deal.\\n* Partner with Sales Enablement to equip Sales and Channel teams with the assets, tools, and training they need to convert---pitch decks, demo narratives, objection handling, ROI tools, and discovery frameworks. Walk the floor with reps. Sit in on calls. Iterate based on what actually moves deals.\\n* Build a steady cadence of customer interviews, win and loss analysis, analyst feedback, and field signal collection. Own the case study and testimonial elements of the wider advocacy program. Proactively coordinate meetings with customers for interviews at tradeshows and analyst meetings.\\n* Support the Comms \\\\& IR team with analyst relationship engagements. Help source customers for RFPs and G2 reviews. Help ensure we are securing the right customers for the right asks.\\n* Lead and grow the Senior Product Marketing \\\\& Competitive Intelligence Manager.\\n* Set high standards, give direct feedback, and build a high-output, low-drama team culture.\\n* Travel 10-15% of the year for company events\\n\\n**To qualify for this role, you have:**\\n\\n* 7+ years of professional experience inside the cybersecurity industry. This is a hard requirement. We need someone who already understands the threat landscape, the buyer, the channel, and the competitive set.\\n* A proven track record in product marketing leadership, ideally with direct ownership of competitive intelligence. Experience launching products, building positioning, and enabling sales teams at scale.\\n* Demonstrated ability to operate as both player and coach. You have built strategy, and you have written the deck. You have run the team, and you have run the launch.\\n* Experience working closely with Sales, Product, and Executive Leadership in a high-growth SaaS or cybersecurity environment.\\n* Practical, hands-on experience using AI tools to accelerate marketing workflows. You can describe specific workflows you have rebuilt with AI, the leverage you generated, and how you coached your team to do the same. AI is *not* a nice-to-have in this role---it is core to how the function operates.\\n* Ability to travel 10-15% of the year for company events\\n* Ability to work hours overlapping with ET hours\\n* Must be eligible to work in the region of hire without sponsorship from an employer now and/or in the future\\n\\n**Bonus points for:**\\n\\n* Direct experience with MSP and channel sales motions\\n* Prior analyst relations or industry analyst engagement experience\\n* Experience building a competitive intelligence program from scratch\\n\\n**We Offer:**\\n\\n* Pathway to promotion to additional organizational positions and responsibilities based upon results and performance, not just time in the chair. You help us grow, and we will help you grow.\\n* Passionate and intelligent colleagues who work hard and have a good time doing it\\n* Paid company-wide week off at the end of each year\\n* Flexible Vacation Policy\\n* Awesome company swag\\n* Full medical, dental, and vision benefits for US, UK, and Canada-based employees\\n* Full short-term disability and life benefits; available long-term disability\\n* Retirement savings account options with vested company matching for qualifying employees\\n* In-person annual gatherings. Last time we all spent a week on a beach in the Dominican Republic!\\n\\n*DNSFilter is a pay-for-performance organization, which means there is an opportunity to advance your compensation based on performance over time. The hiring base pay is dependent on several factors, including level, function, training, transferable skills, work experience, business needs, and geographic location. As a hybrid company, our compensation reflects the cost of labor across several U.S. and global geographic markets. We pay differently based on those defined markets. Our Talent Team can share more about the specific salary range for the job location during the hiring process.*\\n\\n*DNSFilter participates in the E-Verify program.*\\n\\n*At DNSFilter, we utilize sophisticated software and tools to identify and eliminate Deepfake candidates. This approach helps us maintain the integrity of our hiring process, ensuring that we select the most qualified and genuine individuals to join our team.*  \\nU.S. hiring salary range  \\n$180,000---$210,000 USD\",\r\n" + //
                        "        \"industry\": \"Construction\",\r\n" + //
                        "        \"jobBenefits\": \"Team Events\",\r\n" + //
                        "        \"title\": \"Director, Product Marketing and Competitive Intelligence\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://boards.greenhouse.io/dnsfilter/jobs/5145277007?gh_jid=5145277007\",\r\n" + //
                        "        \"relevantOccupation\": \"Manager\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"MS-DOS\",\r\n" + //
                        "          \"Iteration\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"1214ca9d455860a54f99bdf0\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"DNSFilter\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"Marketing\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"579e8434e0484489cffe265b\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"name\": \"United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"minSalary\": 180000,\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"title\": \"Director, Product Marketing and Competitive Intelligence\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"MS-DOS\",\r\n" + //
                        "        \"Iteration\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:47:09.812748Z\",\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"Director\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FlexTime\",\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"company\": \"DNSFilter\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"Marketing\",\r\n" + //
                        "      \"isDirect\": true,\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"occupation\": \"Engineer\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:47:11.009541Z\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Construction\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49b79ffcdf8f0bb8c03fb6\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FlexTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"165000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"190000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"DNSFilter's mission is to protect our customers and partners with products they love to use! We are revolutionizing network security by providing fast, accurate, and reliable threat protection and content filtering. We're a rapidly growing company dedicated to creating a safer internet for businesses and organizations worldwide. Leveraging AI-driven threat intelligence, DNSFilter empowers our customers to proactively block threats before they impact their networks. We foster a collaborative, innovative, and results-oriented culture where every team member contributes to our mission of making the internet safer.\\n\\nAs we continue our product-fueled growth by adding new features and broadening our solution to meet the needs of the global market, it's clear there's a missing piece. That's where you come in!\\n\\n**We are looking for a Senior GTM Systems Engineer to own the technical foundation that powers our go-to-market teams. In this role, you'll architect and configure our core platforms, build and maintain cross-system integrations, and lead our strategy for embedding AI into GTM workflows. The ideal candidate is a seasoned Salesforce technologist who thinks in systems, sweats the details on data quality, and knows how to build automations that actually get adopted and maintained.**\\n\\n**Eligible candidates have and can work successfully in a small to mid-sized fast-paced, hyper-growth, SaaS start-up or scale-up. This is a full-time role.**\\n\\nWe recognize that people come with a wealth of experience and talent beyond just the technical requirements of a job. If you feel like this job is for you, please apply. We believe diversity of experience and skills, including transferable skills, combined with passion, is a key to innovation and excellence; therefore, we encourage people from all backgrounds to apply to our positions!\\n\\n**In this role, you will:**\\n\\n*Core Platform Architecture \\\\& Configuration*\\n\\n* Own the technical design and configuration of Salesforce, HubSpot, Vitally, and Zendesk, including data models, object relationships, field governance, and validation rules\\n* Build and maintain Flows, Apex triggers, and custom objects in Salesforce to support complex, multi-channel GTM logic\\n* Configure HubSpot workflows, lifecycle stages, lead scoring, and campaign attribution to support Marketing and BDR operations\\n* Manage Vitally health scores, segments, playbooks, and integrations to give CS the signals they need to retain and expand customers\\n\\n*Integrations \\\\& Data Pipeline*\\n\\n* Design and maintain real-time and batch integrations across the GTM stack and into adjacent systems (billing, product analytics, data warehouse)\\n* Own API-level connections and define sync logic between Salesforce and HubSpot so Sales and Marketing operate from a single source of truth\\n* Partner with the Lead Operations Engineer to ensure GTM data and downstream reporting is trustworthy and aligned to business processes\\n\\n*Automation \\\\& Workflow Design*\\n\\n* Identify and eliminate manual work for GTM teams through automation: lead routing, lifecycle transitions, renewal triggers, health alerts, and expansion signals\\n* Architect automations with maintainability in mind -- documented, testable, and built so a new teammate can pick them up quickly\\n\\n*AI-Powered GTM Operations*\\n\\n* Own the strategy for embedding AI (primarily Claude) into GTM platforms and workflows, identifying where it creates the most leverage across Sales, Marketing, and CS\\n* Build and deploy AI-assisted automations within Salesforce, HubSpot, and Vitally: intelligent lead scoring and routing, deal risk detection, call and email summarization, and CS health signal enrichment\\n* Connect AI capabilities to GTM data through APIs, MCP integrations, and platform-native AI features with proper governance guardrails\\n* Measure the impact of AI implementations on team productivity, data quality, and revenue outcomes\\n\\n*Data Quality \\\\& Governance*\\n\\n* Champion data hygiene across all platforms: define standards, build enforcement rules, and create processes that keep records clean at the source\\n* Establish and maintain a change management process: version control, sandbox testing, release notes, and rollback plans\\n\\n**To qualify for this role, you have:**\\n\\n* 7 years of Salesforce Admin/Sr. Admin experience with custom objects, flows, and demonstrated progressive platform ownership\\n* Experience configuring HubSpot, including workflows, lifecycle management, forms, and Salesforce integration\\n* Hands-on experience with at least one CS platform (Vitally, Gainsight, or similar)\\n* Demonstrated experience building and maintaining cross-platform integrations and familiarity with the standard revenue operations stack: ZoomInfo, Gong, 6sense, etc.\\n* Strong understanding of GTM system models: lead-to-opportunity, account/contact hierarchy, deal stages, customer segments, etc.\\n* Experience integrating LLMs or AI tools (Claude or similar) into GTM platforms and workflows\\n* Ability to write clear technical documentation and explain architecture decisions to non-technical stakeholders\\n* Ability to work hours overlapping with ET hours\\n* Must be eligible to work in the region of hire without sponsorship now and/or in the future\\n\\n**Bonus points for:**\\n\\n* Prior ownership of a full system migration or major re-architecture (e.g., consolidating two Salesforce orgs, replacing a legacy CRM)\\n* Prior experience with core platform architecture reviews, preferably Salesforce\\n* Salesforce Platform App Builder or Developer certification\\n* Project management experience, including coordination with external consulting partners\\n* Familiarity with core RevOps metrics: pipeline, deal velocity, ARR, lead conversion, customer health, etc.\\n* Exposure to data warehouse tooling and how GTM data lands there\\n* You ask \\\"why\\\" before building -- understanding the business need before reaching for a solution\\n* You think about the downstream impacts of your decisions on data quality, user experience, and system performance\\n* You communicate proactively, flag blockers early, and document your work clearly\\n* You push back constructively when scope creeps or requirements don't hold up technically, and bring alternative solutions to the table\\n\\n**We Offer:**\\n\\n* Pathway to promotion based on results and performance, not just time in the chair. You help us grow, and we will help you grow.\\n* Passionate and intelligent colleagues who work hard and have a good time doing it\\n* Paid company-wide week off at the end of each year\\n* Flexible Vacation Policy\\n* Awesome company swag\\n* Full medical, dental, and vision benefits for US, UK, and Canada-based employees\\n* Full short-term disability and life benefits; available long-term disability\\n* Retirement savings account options with vested company matching for qualifying employees\\n* In-person annual gatherings. Last time we all spent a week on a beach in the Dominican Republic!\\n\\nDNSFilter is a pay-for-performance organization, which means there is an opportunity to advance your compensation based on performance over time. The hiring base pay is dependent on several factors, including level, function, training, transferable skills, work experience, business needs, and geographic location. As a hybrid company, our compensation reflects the cost of labor across several U.S. and global geographic markets. We pay differently based on those defined markets. Our Talent Team can share more about the specific salary range for the job location during the hiring process.\\n\\nDNSFilter participates in the E-Verify program.  \\n\\nAt DNSFilter, we utilize sophisticated software and tools to identify and eliminate Deepfake candidates. This approach helps us maintain the integrity of our hiring process, ensuring that we select the most qualified and genuine individuals to join our team.  \\nU.S. hiring salary range  \\n$165,000---$190,000 USD\",\r\n" + //
                        "        \"industry\": \"Construction\",\r\n" + //
                        "        \"title\": \"Senior GTM Systems Engineer\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://boards.greenhouse.io/dnsfilter/jobs/5128200007?gh_jid=5128200007\",\r\n" + //
                        "        \"relevantOccupation\": \"Engineer\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"MS-DOS\",\r\n" + //
                        "          \"Autoconf\",\r\n" + //
                        "          \"Cross-platform software\",\r\n" + //
                        "          \"Apache Velocity\",\r\n" + //
                        "          \"C Sharp\",\r\n" + //
                        "          \"C\",\r\n" + //
                        "          \"CryEngine\",\r\n" + //
                        "          \"Deep learning\",\r\n" + //
                        "          \"GT.M\",\r\n" + //
                        "          \"Maintainability\",\r\n" + //
                        "          \"Sync\",\r\n" + //
                        "          \"Checkstyle\",\r\n" + //
                        "          \"GNewSense\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"1214ca9d455860a54f99bdf0\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"DNSFilter\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"N/A\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"579e8434e0484489cffe265b\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"name\": \"United States\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"minSalary\": 165000,\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"title\": \"Senior GTM Systems Engineer\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"MS-DOS\",\r\n" + //
                        "        \"Autoconf\",\r\n" + //
                        "        \"Cross-platform software\",\r\n" + //
                        "        \"Apache Velocity\",\r\n" + //
                        "        \"C Sharp\",\r\n" + //
                        "        \"C\",\r\n" + //
                        "        \"CryEngine\",\r\n" + //
                        "        \"Deep learning\",\r\n" + //
                        "        \"GT.M\",\r\n" + //
                        "        \"Maintainability\",\r\n" + //
                        "        \"Sync\",\r\n" + //
                        "        \"Checkstyle\",\r\n" + //
                        "        \"GNewSense\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:47:11.009541Z\",\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"Senior\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FlexTime\",\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"company\": \"DNSFilter\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"N/A\",\r\n" + //
                        "      \"isDirect\": true,\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"occupation\": \"General Manager – Home Services\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T02:31:04.990823Z\",\r\n" + //
                        "      \"city\": \"Elmwood Park\",\r\n" + //
                        "      \"timezone\": \"EDT\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Automotive\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49c1e9fcdf8f0bb8c03fb7\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FullTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"110000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"150000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"🚪 Door Works\\n- ------------\\n\\n### General Manager -- Elmwood Park, NJ\\n\\n**$110,000--$150,000 \\\\| Full Benefits \\\\| Leadership Role**\\n\\nDoor Works is seeking a driven, hands-on **General Manager** to lead our service and installation teams in Elmwood Park, NJ. This role oversees daily operations, field performance, scheduling, inventory, safety, and profitability --- ensuring exceptional customer experiences and strong financial results.\\n\\n*** ** * ** ***\\n\\n### What You'll Do\\n\\n* Lead service \\\\& installation operations\\n\\n* Manage dispatch, scheduling, and technician performance\\n\\n* Oversee inventory, fleet maintenance, and operational reporting\\n\\n* Partner with Sales to drive revenue and margin\\n\\n* Maintain OSHA compliance and safety training\\n\\n* Resolve customer concerns and uphold quality standards\\n\\n* Assist with hiring, onboarding, and team development\\n\\n*** ** * ** ***\\n\\n### What You Bring\\n\\n* Operations leadership experience (home services preferred)\\n\\n* Knowledge of residential \\\\& commercial garage doors\\n\\n* Experience with ServiceTitan strongly preferred\\n\\n* Strong financial \\\\& data analysis skills\\n\\n* Excellent communication and leadership abilities\\n\\n* Valid Driver's License\\n\\n*** ** * ** ***\\n\\n### What We Offer\\n\\n* Competitive salary: **$110K--$150K**\\n\\n* Health, Dental, Vision\\n\\n* PTO \\\\& Paid Holidays\\n\\n* 401(k) with match\\n\\n* Employer-paid Life, LTD \\\\& STD\\n\\n* Growth opportunities within a leading residential services organization\\n\\nIf you're ready to lead teams, improve operations, and drive results --- **apply today and grow with Door Works.** 🚪\\n\\n***Guild Garage Group LLC is an Equal Opportunity Employer AA/EOE/M/F/V/D. In compliance with the Americans with Disabilities Act, Door Works may provide reasonable accommodations to qualified individuals with disabilities and encourages both prospective and current employees to discuss potential accommodations with the employer.***\\n\\n***All candidates are required to undergo pre-employment Background and Drug Screenings, as well as a Motor Vehicle Record Check.***\\n\\n***\\\\*This posting provides details on potential commissioned compensation ranges and possibilities. These amounts are not guaranteed and should in no way be construed as a salary offer.***  \\nPay Range  \\n$110,000---$150,000 USD  \\nBy submitting your application, you consent to receive text messages, emails, and phone calls from Guild Garage Group and/or our coalition of partnered brands regarding job opportunities, application status, and recruiting-related communications. Message and data rates may apply. You may opt out of receiving text messages at any time by replying STOP. All messages are related to employment opportunities and recruiting activities.\",\r\n" + //
                        "        \"industry\": \"Automotive\",\r\n" + //
                        "        \"jobBenefits\": \"Paid Holidays, Pension Plan\",\r\n" + //
                        "        \"title\": \"General Manager – Home Services\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://job-boards.greenhouse.io/doorworks/jobs/4178125009\",\r\n" + //
                        "        \"relevantOccupation\": \"General Manager – Home Services\",\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"e01c5c975bd7fc30afc5c793\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"Door Works\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"N/A\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"3cad25c72c5d2bb9d7e711d1\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"addressLocality\": \"Elmwood Park\",\r\n" + //
                        "            \"addressRegion\": \"NJ\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"latitude\": 40.89959,\r\n" + //
                        "          \"name\": \"Elmwood Park, NJ\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"longitude\": -74.11578\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"geoPoint\": {\r\n" + //
                        "        \"lon\": -74.11578,\r\n" + //
                        "        \"lat\": 40.89959\r\n" + //
                        "      },\r\n" + //
                        "      \"title\": \"General Manager – Home Services\",\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T02:31:04.990823Z\",\r\n" + //
                        "      \"timezoneOffset\": -4,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"company\": \"Door Works\",\r\n" + //
                        "      \"state\": \"NJ\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"N/A\",\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"minSalary\": 110000,\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isDirect\": true\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"occupation\": \"General Application\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T02:31:05.098262Z\",\r\n" + //
                        "      \"city\": \"Elmwood Park\",\r\n" + //
                        "      \"timezone\": \"EDT\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Automotive\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49c1e9fcdf8f0bb8c03fb8\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"Holidays\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"USD\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"USD\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"18.00\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"25.00\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"**About Us**\\n- -----------\\n\\nAt **Door Works, Inc.** , we specialize in high-quality garage door installation, service, and repair for **residential and commercial** customers across **New Jersey and the Greater New York area**.\\n\\nOur story began in 2014 when several respected companies --- Ramsey Door, Groenewal, Raynor Door, and Garden State Door --- came together to form one powerful team. Since then, we've continued to grow, welcoming Bridgewater Overhead Door, Hillsborough/Independent Doors, and Doors Inc. to the Door Works family.\\n\\nFrom our **Elmwood Park showroom** (one of the largest in the state) to our fully stocked service trucks on the road every day, we're proud to deliver professional, friendly, and reliable service our customers can count on.\\n\\n*** ** * ** ***\\n\\n**We're Always Looking for Great People!**\\n- -----------------------------------------\\n\\nDon't see a specific role that fits right now? No problem --- we're always growing and hiring great people who share our dedication to quality, safety, and customer satisfaction.\\n\\nWe frequently hire for:\\n\\n* **Garage Door Installers**\\n\\n* **Service Technicians**\\n\\n* **Apprentices / Helpers**\\n\\n* **Warehouse \\\\& Inventory Assistants**\\n\\n* **Office \\\\& Administrative Support**\\n\\n* **Sales Representatives**\\n\\n*** ** * ** ***\\n\\n**What We Look For**\\n- -------------------\\n\\n✅ Strong work ethic and reliability  \\n\\n✅ Positive, customer-focused attitude  \\n\\n✅ Willingness to learn and take direction  \\n\\n✅ Basic mechanical or construction skills (a plus!)  \\n\\n✅ Valid driver's license and clean driving record (for field roles)  \\n\\n✅ Ability to lift 50 lbs and work safely in various weather conditions  \\n\\n✅ Pride in workmanship and attention to detail\\n\\n*** ** * ** ***\\n\\n### **Why Join Door Works**\\n\\n* Competitive pay based on experience and performance\\n\\n* Health, dental, and vision benefits\\n\\n* Paid time off and holidays\\n\\n* 401(k) retirement plan\\n\\n* Training and advancement opportunities\\n\\n* Work with industry-leading brands like LiftMaster, Raynor, and Clopay\\n\\n* A supportive, team-oriented environment where your hard work is recognized\\n\\n*** ** * ** ***\\n\\n### **Join the Team That Opens Doors --- Literally and Professionally.**\\n\\nIf you're ready to build a meaningful career with a company that values quality, teamwork, and integrity, we'd love to hear from you.\\n\\n👉 **Apply today and become part of the Door Works family!**\\n\\n**Door Works, Inc.**   \\n\\nProudly Serving New Jersey \\\\& the Greater New York Area  \\nwww.doorworks.com\\n\\n***Guild Garage Group LLC is an Equal Opportunity Employer AA/EOE/M/F/V/D. In compliance with the Americans with Disabilities Act, Door Works may provide reasonable accommodations to qualified individuals with disabilities and encourages both prospective and current employees to discuss potential accommodations with the employer.***\\n\\n***All candidates are required to undergo pre-employment Background and Drug Screenings, as well as a Motor Vehicle Record Check.***\\n\\n***\\\\*This posting provides details on potential commissioned compensation ranges and possibilities. These amounts are not guaranteed and should in no way be construed as a salary offer.***  \\nPay Range  \\n$18---$25 USD  \\nBy submitting your application, you consent to receive text messages, emails, and phone calls from Guild Garage Group and/or our coalition of partnered brands regarding job opportunities, application status, and recruiting-related communications. Message and data rates may apply. You may opt out of receiving text messages at any time by replying STOP. All messages are related to employment opportunities and recruiting activities.\",\r\n" + //
                        "        \"industry\": \"Automotive\",\r\n" + //
                        "        \"jobBenefits\": \"Paid Holidays, Pension Plan\",\r\n" + //
                        "        \"title\": \"General Application\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://job-boards.greenhouse.io/doorworks/jobs/4060995009\",\r\n" + //
                        "        \"relevantOccupation\": \"General Application\",\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"e01c5c975bd7fc30afc5c793\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"Door Works\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"url\": \"https://doorworks.com\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"N/A\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"3cad25c72c5d2bb9d7e711d1\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"addressLocality\": \"Elmwood Park\",\r\n" + //
                        "            \"addressRegion\": \"NJ\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"latitude\": 40.89959,\r\n" + //
                        "          \"name\": \"Elmwood Park, NJ\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"longitude\": -74.11578\r\n" + //
                        "        },\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"EDT Timezone\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"greenhouse_us\",\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"geoPoint\": {\r\n" + //
                        "        \"lon\": -74.11578,\r\n" + //
                        "        \"lat\": 40.89959\r\n" + //
                        "      },\r\n" + //
                        "      \"title\": \"General Application\",\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T02:31:05.098262Z\",\r\n" + //
                        "      \"timezoneOffset\": -4,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"company\": \"Door Works\",\r\n" + //
                        "      \"state\": \"NJ\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"greenhouse\",\r\n" + //
                        "      \"department\": \"N/A\",\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"minSalary\": 18,\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FullTime\",\r\n" + //
                        "        \"Holidays\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isDirect\": true\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"occupation\": \"IT Manager\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:30:53.139Z\",\r\n" + //
                        "      \"city\": \"Nashville\",\r\n" + //
                        "      \"timezone\": \"CDT\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"Contract\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Gastronomy\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49c8e5a76cf24e741c2729\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FullTime, Contract\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"EUR\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"EUR\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"100000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"120000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\",\r\n" + //
                        "            \"unitText\": \"Year\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"Requirements\\n- -----------\\n\\n### Must have:\\n\\n### - Were looking for 7--10+ years of IT leadership experience, ideally within hospitality, restaurants, or hotels. - We need strong expertise in multi-unit IT infrastructure and connected technology environments. - Experience with POS platforms such as OpenTable and Toast, along with broader hospitality tech stacks, is required. - We expect proven capability in cybersecurity, PCI compliance, and risk mitigation. - Were seeking someone with experience managing vendors, contracts, and IT budgets. - Strong leadership, communication, and analytical problem-solving skills are essential. - Experience supporting both restaurant and hotel operations is preferred. - Familiarity with cloud platforms such as AWS, Azure, or Google Cloud is important. - We value experience with systems integration and API-driven platforms. - Experience scaling IT infrastructure for growing organizations is needed. - Being based in Nashville is preferred. - Proof of eligibility to work in the United States is required.\\n\\nResponsibilities:\\n- ----------------\\n\\n- Develop and implement an enterprise IT strategy that supports our business objectives and expansion plans. - Support growth across multiple properties in Texas and Tennessee. - Lead IT budgeting, forecasting, and vendor negotiations. - Build and maintain strong relationships with external technology partners. - Oversee our full IT infrastructure, including networks, hardware, cloud services, and on-premise solutions. - Ensure dependable uptime and system reliability across restaurants, hotel, and corporate office locations. - Manage technology rollouts for new openings, renovations, and concept launches. - Oversee and optimize core platforms, including POS systems and inventory/ERP tools. - Ensure smooth integration between POS, reservations, accounting, payroll, CRM, and other business systems. - Support digital guest-facing experiences such as online ordering, reservations, and mobile engagement. - Establish and uphold cybersecurity policies and best practices. - Maintain PCI compliance and safeguard guest and payment data. - Lead internal IT support or oversee outsourced helpdesk services. - Work with leadership to enhance reporting capabilities and improve data access. - Support business intelligence tools and dashboards. - Protect data integrity across all systems. - Travel regularly, about 25% of the time, to coordinate with regional teams and support on-site operations.\\n- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\\n\\nCompany:\\n- -------\\n\\nWe are The Twelve Thirty Club in Nashville, part of Author \\\\& Edit, the hospitality group created by restaurant innovator Sam Fox. Our concepts are designed with a distinctive global perspective and a strong connection to the communities we serve. We offer a range of benefits, including restaurant discounts, an employee assistance program focused on mental health and wellness, medical coverage with HSA options, dental and vision insurance, life, accident protection and critical illness coverage, pet insurance, and domestic partner benefits. We are a creative, guest-focused team that values hospitality, passion, and career growth, and this is an in-person role with a salary range of $100,000 to $120,000 per year.\\n- ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\",\r\n" + //
                        "        \"industry\": \"Gastronomy\",\r\n" + //
                        "        \"jobBenefits\": \"Health Insurrance\",\r\n" + //
                        "        \"title\": \"Director of IT\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://devitjobs.com/jobs/The-Twelve-Thirty-Club-Director-of-IT\",\r\n" + //
                        "        \"relevantOccupation\": \"IT Manager\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"Manager\",\r\n" + //
                        "          \"API\",\r\n" + //
                        "          \"AWS\",\r\n" + //
                        "          \"Azure\",\r\n" + //
                        "          \"Business Intelligence\",\r\n" + //
                        "          \"Cloud\",\r\n" + //
                        "          \"CRM\",\r\n" + //
                        "          \"Dapper\",\r\n" + //
                        "          \"ERP\",\r\n" + //
                        "          \"Hardware\",\r\n" + //
                        "          \"Support\",\r\n" + //
                        "          \"Mobile\",\r\n" + //
                        "          \"Cloud computing\",\r\n" + //
                        "          \"Roxio Toast\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"responsibilities\": \"Develop and implement an enterprise IT strategy that supports our business objectives and expansion plans, Support growth across multiple properties in Texas and Tennessee, Lead IT budgeting, forecasting, and vendor negotiations, Build and maintain strong relationships with external technology partners, Oversee our full IT infrastructure, including networks, hardware, cloud services, and on-premise solutions, Ensure dependable uptime and system reliability across restaurants, hotel, and corporate office locations, Manage technology rollouts for new openings, renovations, and concept launches, Oversee and optimize core platforms, including POS systems and inventory/ERP tools, Ensure smooth integration between POS, reservations, accounting, payroll, CRM, and other business systems, Support digital guest-facing experiences such as online ordering, reservations, and mobile engagement, Establish and uphold cybersecurity policies and best practices, Maintain PCI compliance and safeguard guest and payment data, Lead internal IT support or oversee outsourced helpdesk services, Work with leadership to enhance reporting capabilities and improve data access, Support business intelligence tools and dashboards, Protect data integrity across all systems, Travel regularly, about 25% of the time, to coordinate with regional teams and support on-site operations\",\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"74f480a55ad5c97d698d5db5\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"The Twelve Thirty Club\",\r\n" + //
                        "          \"logo\": \"https://static.devitjobs.com/logo-images/https://d2q79iu7y748jz.cloudfront.net/s/_squarelogo/256x256/5f784add4439627457fc6cee635ec2d5\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"Customer Support\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"4c73364e459e6c6c17ea45bd\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"streetAddress\": \"Broadway 111\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"postalCode\": \"37201\",\r\n" + //
                        "            \"addressLocality\": \"Nashville\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"latitude\": 36.1619307,\r\n" + //
                        "          \"name\": \"Broadway 111, 37201 Nashville\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"longitude\": -86.7751004\r\n" + //
                        "        },\r\n" + //
                        "        \"educationRequirements\": \"Were looking for 7–10+ years of IT leadership experience, ideally within hospitality, restaurants, or hotels, We need strong expertise in multi-unit IT infrastructure and connected technology environments, Experience with POS platforms such as OpenTable and Toast, along with broader hospitality tech stacks, is required, We expect proven capability in cybersecurity, PCI compliance, and risk mitigation, Were seeking someone with experience managing vendors, contracts, and IT budgets, Strong leadership, communication, and analytical problem-solving skills are essential, Experience supporting both restaurant and hotel operations is preferred, Familiarity with cloud platforms such as AWS, Azure, or Google Cloud is important, We value experience with systems integration and API-driven platforms, Experience scaling IT infrastructure for growing organizations is needed, Being based in Nashville is preferred, Proof of eligibility to work in the United States is required\",\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"Onsite, CDT Timezone\",\r\n" + //
                        "        \"sameAs\": \"https://www.indeed.com/tmn/ccs/48adbe920c3d2749/6be58bd7efb6df06a16ea4b0d1ba4f2a5f73ffaba26fc12fe922aa7e1f9113de/7985898892702321?sf=VaC01\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"devjobs_us\",\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"geoPoint\": {\r\n" + //
                        "        \"lon\": -86.7751004,\r\n" + //
                        "        \"lat\": 36.1619307\r\n" + //
                        "      },\r\n" + //
                        "      \"title\": \"Director of IT\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"Manager\",\r\n" + //
                        "        \"API\",\r\n" + //
                        "        \"AWS\",\r\n" + //
                        "        \"Azure\",\r\n" + //
                        "        \"Business Intelligence\",\r\n" + //
                        "        \"Cloud\",\r\n" + //
                        "        \"CRM\",\r\n" + //
                        "        \"Dapper\",\r\n" + //
                        "        \"ERP\",\r\n" + //
                        "        \"Hardware\",\r\n" + //
                        "        \"Support\",\r\n" + //
                        "        \"Mobile\",\r\n" + //
                        "        \"Cloud computing\",\r\n" + //
                        "        \"Roxio Toast\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:30:53.139Z\",\r\n" + //
                        "      \"timezoneOffset\": -5,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"company\": \"The Twelve Thirty Club\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"devjobs\",\r\n" + //
                        "      \"department\": \"Customer Support\",\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"Onsite\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"minSalary\": 100000,\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"Director\",\r\n" + //
                        "        \"Lead\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"postCode\": \"37201\",\r\n" + //
                        "      \"isDirect\": true\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"occupation\": \"Systems Administrator\",\r\n" + //
                        "      \"dateActive\": \"2026-08-05T01:19:21.922Z\",\r\n" + //
                        "      \"city\": \"San Antonio\",\r\n" + //
                        "      \"timezone\": \"CDT\",\r\n" + //
                        "      \"contractType\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"language\": \"en\",\r\n" + //
                        "      \"industry\": \"Environmental\",\r\n" + //
                        "      \"jsonLD\": {\r\n" + //
                        "        \"identifier\": \"6a49c8fca76cf24e741c2734\",\r\n" + //
                        "        \"validThrough\": \"2026-08-05\",\r\n" + //
                        "        \"employmentType\": \"FullTime\",\r\n" + //
                        "        \"@type\": \"JobPosting\",\r\n" + //
                        "        \"salaryCurrency\": \"EUR\",\r\n" + //
                        "        \"baseSalary\": {\r\n" + //
                        "          \"@type\": \"MonetaryAmount\",\r\n" + //
                        "          \"currency\": \"EUR\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"value\": {\r\n" + //
                        "            \"minValue\": \"80000\",\r\n" + //
                        "            \"@type\": \"QuantitativeValue\",\r\n" + //
                        "            \"maxValue\": \"85000\",\r\n" + //
                        "            \"@context\": \"https://schema.org\",\r\n" + //
                        "            \"unitText\": \"Year\"\r\n" + //
                        "          }\r\n" + //
                        "        },\r\n" + //
                        "        \"description\": \"Requirements\\n- -----------\\n\\n### Must have:\\n\\n### - We require a high school diploma with 6 to 9 years of relevant experience, or equivalent experience. - We require an active TS/SCI clearance. - We require a current CompTIA Security+ certification. - We are looking for experience as a system administrator in a mid- to large-scale Windows environment. - We require hands-on experience with F5 BIG-IP systems, including load balancers, ADCs, and SSL offloading. - We need someone who can perform daily system health checks. - We require experience installing software on Windows Server platforms. - We require experience troubleshooting in a Windows environment. - We require experience developing standard operating procedures for system functions. - Preferred qualifications include ServiceNow knowledge. - Strong written and verbal communication skills are preferred. - We prefer candidates who can coordinate effectively with stakeholders and collaborate well with team members.\\n\\nResponsibilities:\\n- ----------------\\n\\n- We establish and maintain the reliable operation of computer systems, including operating systems, software, and hardware in both networked and standalone environments. - We install, evaluate, and configure supported products and resolve issues encountered during deployment and use. - We troubleshoot, isolate, and correct system and server problems and anomalies. - We create and document new methods that support network and system operations, and we implement process improvements when needed. - We consult with support teams, help desks, customers, and other technical staff to resolve issues and coordinate maintenance activities. - We identify recurring issues and recommend actions to reduce their impact or frequency. - We may plan transitions from development or production environments to new technologies. - We monitor system performance, manage system data, and determine appropriate server installation methods and procedures. - We configure, deploy, and maintain F5 BIG-IP systems, including load balancers, ADCs, and SSL offloading. - We troubleshoot F5-related performance and availability issues to minimize service disruption. - We collaborate with network, systems, and security teams to integrate F5 solutions into the broader infrastructure. - We design and implement traffic management rules, including GSLB and LSLB. - We manage SSL/TLS offloading, including key and certificate administration for secure communications. - We monitor F5 systems for health and performance and provide optimization recommendations. - We configure and maintain F5 iRules to manage application traffic and support specialized use cases. - We ensure compliance with security policies, best practices, and regulatory requirements. - We support incident response and root cause analysis for F5-related issues affecting critical applications or services. - We maintain documentation for F5 configurations, change management, troubleshooting, and standard operating procedures. - We provide technical guidance and support to other IT teams and end users. - We assist with F5 system upgrades and patching.\\n- ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\\n\\nCompany:\\n- -------\\n\\nWe are hiring a Systems Administrator with F5 load balancing expertise to support an Air Force intelligence system. This is an onsite role based in San Antonio, Texas. The position offers a salary range of USD $80,000 to $85,000 per year and requires work in a secure, mission-critical environment supporting essential infrastructure.\\n- ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\",\r\n" + //
                        "        \"industry\": \"Environmental\",\r\n" + //
                        "        \"title\": \"Load Balancing Systems Administrator\",\r\n" + //
                        "        \"@context\": \"https://schema.org\",\r\n" + //
                        "        \"url\": \"https://devitjobs.com/jobs/Govcio-LLC-Load-Balancing-Systems-Administrator\",\r\n" + //
                        "        \"relevantOccupation\": \"Systems Administrator\",\r\n" + //
                        "        \"skills\": [\r\n" + //
                        "          \"System\",\r\n" + //
                        "          \"Hardware\",\r\n" + //
                        "          \"Support\",\r\n" + //
                        "          \"Load Balancing\",\r\n" + //
                        "          \"Network\",\r\n" + //
                        "          \"Security\",\r\n" + //
                        "          \"Windows\",\r\n" + //
                        "          \"ServiceNow\",\r\n" + //
                        "          \"Autoconf\",\r\n" + //
                        "          \"Dirac\",\r\n" + //
                        "          \"Windows Server\"\r\n" + //
                        "        ],\r\n" + //
                        "        \"responsibilities\": \"We establish and maintain the reliable operation of computer systems, including operating systems, software, and hardware in both networked and standalone environments, We install, evaluate, and configure supported products and resolve issues encountered during deployment and use, We troubleshoot, isolate, and correct system and server problems and anomalies, We create and document new methods that support network and system operations, and we implement process improvements when needed, We consult with support teams, help desks, customers, and other technical staff to resolve issues and coordinate maintenance activities, We identify recurring issues and recommend actions to reduce their impact or frequency, We may plan transitions from development or production environments to new technologies, We monitor system performance, manage system data, and determine appropriate server installation methods and procedures, We configure, deploy, and maintain F5 BIG-IP systems, including load balancers, ADCs, and SSL offloading, We troubleshoot F5-related performance and availability issues to minimize service disruption, We collaborate with network, systems, and security teams to integrate F5 solutions into the broader infrastructure, We design and implement traffic management rules, including GSLB and LSLB, We manage SSL/TLS offloading, including key and certificate administration for secure communications, We monitor F5 systems for health and performance and provide optimization recommendations, We configure and maintain F5 iRules to manage application traffic and support specialized use cases, We ensure compliance with security policies, best practices, and regulatory requirements, We support incident response and root cause analysis for F5-related issues affecting critical applications or services, We maintain documentation for F5 configurations, change management, troubleshooting, and standard operating procedures, We provide technical guidance and support to other IT teams and end users, We assist with F5 system upgrades and patching\",\r\n" + //
                        "        \"hiringOrganization\": {\r\n" + //
                        "          \"identifier\": \"d7c59c585f49a89608444e8f\",\r\n" + //
                        "          \"@type\": \"Organization\",\r\n" + //
                        "          \"name\": \"Govcio LLC\",\r\n" + //
                        "          \"alternateName\": \"Govcio\",\r\n" + //
                        "          \"@context\": \"https://schema.org\"\r\n" + //
                        "        },\r\n" + //
                        "        \"employmentUnit\": \"Legal\",\r\n" + //
                        "        \"jobLocation\": {\r\n" + //
                        "          \"identifier\": \"296da42e84b60bff2dfd77c0\",\r\n" + //
                        "          \"address\": {\r\n" + //
                        "            \"addressCountry\": \"United States\",\r\n" + //
                        "            \"streetAddress\": \"General Hudnell Dr 313\",\r\n" + //
                        "            \"@type\": \"PostalAddress\",\r\n" + //
                        "            \"postalCode\": \"78226\",\r\n" + //
                        "            \"addressLocality\": \"San Antonio\",\r\n" + //
                        "            \"@context\": \"https://schema.org\"\r\n" + //
                        "          },\r\n" + //
                        "          \"@type\": \"Place\",\r\n" + //
                        "          \"latitude\": 29.3831335,\r\n" + //
                        "          \"name\": \"General Hudnell Dr 3133, 78226 San Antonio\",\r\n" + //
                        "          \"@context\": \"https://schema.org\",\r\n" + //
                        "          \"longitude\": -98.5609209\r\n" + //
                        "        },\r\n" + //
                        "        \"educationRequirements\": \"We require a high school diploma with 6 to 9 years of relevant experience, or equivalent experience, We require an active TS/SCI clearance, We require a current CompTIA Security+ certification, We are looking for experience as a system administrator in a mid- to large-scale Windows environment, We require hands-on experience with F5 BIG-IP systems, including load balancers, ADCs, and SSL offloading, We need someone who can perform daily system health checks, We require experience installing software on Windows Server platforms, We require experience troubleshooting in a Windows environment, We require experience developing standard operating procedures for system functions, Preferred qualifications include ServiceNow knowledge, Strong written and verbal communication skills are preferred, We prefer candidates who can coordinate effectively with stakeholders and collaborate well with team members\",\r\n" + //
                        "        \"datePosted\": \"2026-07-05\",\r\n" + //
                        "        \"applicantLocationRequirements\": \"Onsite, CDT Timezone\",\r\n" + //
                        "        \"sameAs\": \"https://click.appcast.io/t/NWRzZXPliwHZBLi-ncAMmfif5X3RiSKAB4ZYiyLfdN6zO6QlcZvIz7XQ9kLuCjIf\"\r\n" + //
                        "      },\r\n" + //
                        "      \"source\": \"devjobs_us\",\r\n" + //
                        "      \"locale\": \"en_US\",\r\n" + //
                        "      \"geoPoint\": {\r\n" + //
                        "        \"lon\": -98.5609209,\r\n" + //
                        "        \"lat\": 29.3831335\r\n" + //
                        "      },\r\n" + //
                        "      \"title\": \"Load Balancing Systems Administrator\",\r\n" + //
                        "      \"skills\": [\r\n" + //
                        "        \"System\",\r\n" + //
                        "        \"Hardware\",\r\n" + //
                        "        \"Support\",\r\n" + //
                        "        \"Load Balancing\",\r\n" + //
                        "        \"Network\",\r\n" + //
                        "        \"Security\",\r\n" + //
                        "        \"Windows\",\r\n" + //
                        "        \"ServiceNow\",\r\n" + //
                        "        \"Autoconf\",\r\n" + //
                        "        \"Dirac\",\r\n" + //
                        "        \"Windows Server\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"dateCreated\": \"2026-07-05T01:19:21.922Z\",\r\n" + //
                        "      \"timezoneOffset\": -5,\r\n" + //
                        "      \"countryCode\": \"us\",\r\n" + //
                        "      \"company\": \"Govcio\",\r\n" + //
                        "      \"isDuplicate\": false,\r\n" + //
                        "      \"portal\": \"devjobs\",\r\n" + //
                        "      \"department\": \"Legal\",\r\n" + //
                        "      \"workPlace\": [\r\n" + //
                        "        \"Onsite\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"isRecruiter\": false,\r\n" + //
                        "      \"minSalary\": 80000,\r\n" + //
                        "      \"hasSalary\": true,\r\n" + //
                        "      \"careerLevel\": [\r\n" + //
                        "        \"N/A\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"workType\": [\r\n" + //
                        "        \"FullTime\"\r\n" + //
                        "      ],\r\n" + //
                        "      \"postCode\": \"78226\",\r\n" + //
                        "      \"isDirect\": true\r\n" + //
                        "    }\r\n" + //
                        "  ],\r\n" + //
                        "  \"resultSizeInBytes\": 81582\r\n" + //
                        "}";
    }
}
