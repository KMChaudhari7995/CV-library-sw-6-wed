Feature: JobSearchTest
  As a user I want to verify Job Search Result Using Different DataSet
@smoke @regression
  Scenario Outline: verify JobSearch Result Using Different DataSet
    Given I am on Homepage
    When I enter "<jobTitle>"
    And  enter Location "<location>"
    And I enter distance "<distance>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I  enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And click on 'Find Jobs' button
    Then I verify the result "<result>"

    Examples:
      |jobTitle         |location                 |distance|salaryMin|salaryMax|salaryType|jobType|result|
      |Tester           |Harrow, Greater London   |5 miles|30000|50000 |Per annum|Permanent|Permanent Tester jobs in Harrow|
      |Automation Tester|Central London           |2 miles|40000|60000 |Per annum|Contract |Contract Automation Tester jobs in Central London|
      |Developer        |Colindale, Greater London|1 mile |3500 |4000  |Per month|Temporary|Temporary Developer jobs in Colindale   |
      |Developer        |Wembley, Greater London  |7 miles|20000|40000 |Per annum|Part Time|Part Time Developer jobs in Wembley  |
      |nurse            |Birmingham               |1 mile |20000|40000 |Per annum|Contract |Contract Nurse jobs in Birmingham    |
      |QA               |Edgware                  |2 miles|30000|50000 |Per month|Part Time|Part Time Qa jobs in Edgware         |