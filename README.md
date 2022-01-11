# JavaSeleniumTestNGMaven

## To run all Tests:

### mvn clean test

# Some Info about the Test

### The question

Write automation to cover the following scenarios:
1. Navigate to https://google.co.nz
2. Search by “Maui” should have a link to ‘maui-rentals.com’ in the returns results
3. Search by “Britz” should have a link to ‘britz.com’ in the returns results

Below is the technology stack used in this repository:
1. Framework - End-to-End Hybrid (Selenium + Cucumber + TestNG + Maven + Java)
2. Workflow - BDD with Cucumber
3. Design pattern - Page Object Model
4. Execution Techniques - Parallel Execution + Single Flow
5. Webdriver - Selenium
6. Programming Language - Java
7. Scenario Syntax - Gherkins
8. Browsers - Chrome + Firefox
9. Build tool - Maven + TestNG
10. Reporting - Cucumber Online
11. Report Evidence - Hosted Web Report + Screenshots attached
11. Instruction for execution - Command provided on the first line of this README.md file

## High Level Architecture of the Project:

![Image illustrating the Architecture of the Project at a High Level](https://github.com/abir4u/JavaSeleniumTestNGMaven/blob/main/src/test/supportingFiles/ProjectArchitecture.png)

The automation framework created in this repository is aimed to keep the implementation contemporary, interpretable and maintainable for the purpose of best practices.

#### Things that have been implemented:

1. Page Object Model - This design pattern has been used along with Page Factory to make the code cleaner and easy to understand **for the developers**. It also separates the code from the test cases, thus making the code more reusable.
2. Behaviour Driven Development - This methodology has been used to make the test cases easy to understand for business stakeholders.
3. Cucumber Reporting - This form of reporting has been used as it takes the least amount of time to implement, and yet provides with a presentable HTML report on a hosted platform available online and focus to charts and tables, when it comes to representing the data.
4. DriverFactory - The project uses Multithreading technique to create multiple asynchronously running tests to cater to parallel execution.
5. Reusable Wrapper Framework - A reusable wrapper framework has been used to showcase the subtleness of my work and level of detail that I go to even in short tasks like this one.
6. Parallel Execution - For quicker execution of tests, parallel test execution has been implemented using TestNG and Cucumber.
7. Properties and configuration of properties: Since there may be some values in the project, which we may want to keep consolidated for greater accessibility, especially when carrying out distributed testing across different nodes, all such properties have kept in a single file and have been configured with FileReader.

## How to integrate the project into the delivery pipeline

Considering the best practices in the market, to integrate the project to a delivery pipeline, two things need to be considered:
- Continuous Integration - A good Branch Strategy backed by proper platform support is the key to this. The main idea behind the Git flow branching strategy is to isolate your work into different types of branches. There are five different branch types in total:
  - Branching:
    -   Main - The main branch contains the production-ready code
    -   Develop - This is the most up-to-date branch where the developers are continuously pushing in their latest reviewed code.
    -   Release - This is the branch that contains the cut from develop branch that is agreed and approved for the next release. This is where Release Regression Automated Testing must be performed. A pipeline for regression must exist here.
    -   Feature
    -   Hotfix

  - Peer Review with Pull Requests: It is very important that all forms of code are reviewed by peers before integration. Pull request must be created before integrating any branch to develop, and hence peer reviews are the most crucial aspect of Feature branches.

  - Platform support: It is important to have separate environments for different branches. Below are the environments that must exist:
    -   Production: This is the real-world user facing environment having the best infrastructure in respects.
    -   Pre-production: This should be made like-to-like with the Prod environment and should be used for performance testing purpose.
    -   Test: This environment should be used mainly for Functional and Security testing purposes.
    -   Dev: This environment is used by developers.

- Continuous Deployment - Jenkins is the most widely used tool for Continuous Deployment. Once the git repository is integrated to Jenkins, pipelines and jobs can be configured to control the integration of code appropriately.
  - Pipelines crucial for Testing: For best quality code deployment, regression builds must be triggered automatically every time a new change is pushed into a major branch. If the regression fails based on the agreed criteria, the deployment will be interrupted and developers must re-review the code. Three pipelines that must have this implemented are:
    -   Main
    -   Develop
    -   Release

- Reduction in delivery timeline - UI Integration Tests can take a long time to execute. When there is a critical Production bug that needs to be fixed, the organisation can't wait for hours after bug fix to deploy the changes. To increase quality, if we have to compromise speed, then that is a problem. Hence, it is recommended to carry out UI Integration Tests in thhe form of distributed and parallel testing. This ensures diversity of scenarios in terms of platforms for execution and decreases the execution time exponentially. Selenium Grid on Cloud platforms using Cloud devices is a very efficient set up for tihs.



Hope this was helpful to understand the repository. However, in case of any doubts feel free to reach out to me any time on my email abirpal16112@gmail.com or call me on 02102963036.

Also, say hi to my selfie below before you leave. ;)

```

                                                                 `````````````````````````````````
                                                                  `  `````````````````````````````
                                       ``````````                      ```````````````````````````
                                 `';<iixaAR%qPI=:.```````              ```````````````````````````
                           ```:L5XD8QQQQQQQQQQQQBNKZI>,````  ```      ````````````````````````````
                         `,=IKQBNQQQQQQ@@@@@@QQQQQQQQQQDY^^!;;:'``` ```  `````````````````````````
                       `,uP6%QQQQ@@@Q@@@@@@@@@@QQ@@@@@@@QQQQQQ%s:'`````   ````````````````````````
                       'EKbBQQQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@QQQQWjT+``````````````````````  ```````
                      `7qNQQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQQR7'```````````````````
                      `76BQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQD}>.`````
                       ,jQQ@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@QQN{'``` `
                       .\QQ@@@@@@@@QQQ#8%%%W8N8WR%WNQQQ@@@@@@@@@@@@QQP_````````
                       ~AQQ@@@@QQQgDqUkEwwwkkUUUUAKKbDRg#QQQ@@@@@@@@QQi'`````````````
                       `uWQ@@@QRqUESojjjjjyoamhhkkkkkXX6KdR8QQQ@@@@@QQi,''...``````````
                       .zQQQQRkZ5yj{ItJtxxxIfjoo5aZSSSmEEkUqd%8BQ@@@QQL,'''''...`````````       `
                       ;NQQQ8XyunnIJzz777zzzJx{jjjyyoaammmEkX6bDgQ@@@QD;,,,''''...````````
                       TQQQQRkjYIsJJJzzzzzzz777zxIujyyoSmSmwEPEXqDQ@@@Q?~~:,,,'''..```````
                       LQQQNDPjIstttzzzzz77z7T7zzztsfjjyaaSmwEEPXD#Q@@W<;;;~_,,,'''.``````
                       ^QQQWKo}YxJz7\iii\cc777777z7zzIs{fjyoSEEhXKWQQQy+^^!;;~~:,,'..`````
                       ,NBNdajySaaoyjfxJJJz\ii\\7cznySEhEEwEkXXUX6d#QQ7>=++^!;;~~,,'.`````
                        yNRSZDB&QQQQQQQQ#DwYz7tJJtjwD8QQQQQQQQQQQRARQ&|*<<<=+^!;;~,''.```
                        =8k}6XPkXXUbR8N8RdUSyjaSyyaXDWNBQ&8gRgNN8NNUQb|??**<<=r!;~_,''.```
                        'D5s}n{ZEkkUKRgW%DbUmyj5SXdRg8NgDK666AqU6Aqk#XL|||??*<=^;;~,,'.```
                       .;6jztf6%KXQNQQD8WdUwj7isoUDD%R%K6R8QBN8gKXXwNwiLL|||?*<r!;~,,''.``
                       L7S}7JjwkwfDQQQKAqUEas\7uoXdDR%UyUQ@QgqNB%qXw%D6tiLL||?<+!;~,,''.``
                       ^?yJzs{}fyamSXUkwZZyt\L\Jfokbd6kXUAKddbbKK6XEdXqtiiLL||*+!;~,,''.``
                       ^LEzzJtsxtzJsuuIx}{J7\izYjyaE6kZaZSSSmEkXhhPEDAhs7ciLL|*+!;~,,''```
                       |xw7TiLii\7zz77zY{{J77zxujoEU6kajffjjjjjjyaSw%D6Yzz7\L|*+!;~,,'.```
                       *ya\L|??||LLi\z}yfnz\iL7IfoPUqqw{z77zzJxnjyZmNNDn777ciL*r!;~,,'.```
                       ~LJi||?*<?LLTsySz7z7i*=\Jf5wEmX%wn777zzsIfyawDKm7T\\iiL*+!;~,,'.```
                       `?fT\i|Li7zIjooyI{yaj{njow6KXXqNKyntJzIn}jowkKXu7T\iiiL*+!;~,,''.``
                        !ozzzzzujoao}suabNW8gDDNQ@@QBDqEooyyjjjyaPXdXjz77c\iiL*+!;~,,''.``
                        `jo{{yyaSmUKKUdRWQ@@@@Q@@@@@@QN8DbAXhEmSh6dgj7z77c\iiL*+!;~,,'.``
                        `7bkyjyaXNQQQQQQQ@QQQQQBQQ@@@@@@@QQWKPEPUD8g77z77c\iiL*r!;~,,'.```
                         :6dUw5aNQQ@QQN%%RDDDDDRgNW8#QQQ@@@QNXX6DNQX77z77c\iL|<^;;~,,'.```
                          <R%RDU&Q@QN%DbqUkmwEXXUqdDg&QQQQ@Q#dDgQQgx77z7Tc\iL|=^;~~,,'.```
                          `ENN#DQQQBRbAKDDdKKU6Kd%WN8gWg#QQQQQQQQQyz7zz77cii|*+!;~_,,'.```       `
                           .ZQQQQQQQNW%%Q@@@@QQQ@@@@Q8WWQQ@@QQQQQUxzzzz77ciL?>^;;~:,'.```        `
                            'jQQQQQQQQN#QQQQ@QQQ@@@@QQQQQ@@@@Q@@6uJzzzz77\i|*+!;~_,,'.````     ```
                             `zQQQ@QQQNW8QQQ@@@@@@@@QQQQQ@@@@@@DxJzzzzz7TiL?=^;;~,,'.``````   ````
                               |QQQ@@QQQ@QQQQ@QQQ@@@@@@@@@@@@@qsxJzzzzJ7ci|<^!;~:,,'.`````````````
                               `jQQ@@@@@@@@@@@Q@@@@@@@@@@@@@@AIsxtJzzzJ7i|*=^;~_,,''.`````````````
                                |qQ@@@@@@@@@@@@@@@@@@@@@@@@QRwIIsxtJzzJ7i|<r!;~:,,'.``````````````
                               `ijKQQ@@@@@@@@@@@@@@@@@@@@@QNKEj{IsxsJtIzcL*+!;~_,,'.``````````````
                          ````.^7zjKQQ@@@@@@@@@@@@@@@@@@@QNb6U%QbIYYxsut7i|>^;;~:,''.`````````````
                       _shS}zczz7zzxyDQ@@@@@@@@@@@@@@@@Q%dq6U6K&EJ}YIIfnJ7\|<+!;~_,,''''..........
                ``.,,,;D6auxJ777c7ciiJo%#Q@@@@@@@QQQQNDqUUXkUAdAus{}JzJzzJzcL?=^!;~:,,,,''''''''''
   ``.'',:~;;!+<>=<<^;{XnsJ77cii\Tc\iLi7syhqDKUKDKU6UUEEEEEhX6wxJJx77c\77i\\iL|*<+!;;~~~:,,,,,,,,,
~;!=?||L??||?|L|<||<^;5A}J7\\LL|Li\iiLLLiiTzxxsn{jjjjZZZSSmwkfz7c7zz7\i77\\i7\iL||*<=^^!;;;~~~~___
*|L||?*?|?*|i\7*=?i<!;LdwfYziL|||Li\iiiiLiLLLLi7zxI{jyaSwEEy7\\\\T7c77\i\ciiT77ciiiiLLLL?*=+^!!;;;
i\LL<+=|i?+|||i<^|*?!;^zkwyfYJc||?L\\iiiiiiiiii7JsnujowXXyz\\Lii\i\7\iii\77Tcci\\Li\iiiiiiLi|||?=r
77|i?^+iz|<*i|<!!*=?+;;^=nay}{{Iz7\iL|||i\\ccTzJJu}{jaZYTiT\ii\iLii\iii\7\\c\iiiiiLiiiic77\L|ii\L*
JL=*=;^i7L*?*<^;!*?^==!!^r>zf5junIzi|?*?Li\\iTzsnfjfsi||LLiLLLL||iLii|Li\iLL|ii|||LiLL|ic\i|?L\iL?
\><|+;<\7i?*++;;=i?<=+*^^;^^!^\fyyyfuz77zztsYIItz7L|LL||LL?*<LL|||LLL||Lii|||LL|?||?|?*|LL|?|Liii|
?+?>;!*iT||*+^~;*L|<==^^=+^;;!r+<*|Li7T7zTLi|<|L|L||||<<<==<<|i|??|****|LLLLL|L||?**=*LLiL??|LiLiL
<+<;~^|ii*=^!;;+Lii|<r++^^^^rr!!^^^^^=+=<+*<<=<*|||<*===?<+^+?L|?<<>?*<*|iii|LiLLL???==**?||<L\iLL
^^^~^*||?>=!;~!<|\i|?=+^+=+^!^^^^^^+=^+><<<*=>=*||?*>++<<=++*?|**<*<<=<|ii|<<*LLLLL|*=r=**L|LLLLLL
;;~;>||i==+;~~^=*L|?<++^<*=++^^+^!r=+++^+=<<>+=r+<??=+>=^+^^r<?<<<==^=**||*<<<><|ii|?<=^>*iL||?|?|
;~;=|||*+r^;~^<=*|||**^!=**=++=^^^^^^^^++^+++<=+<*|<+^=^^^^==***><<+++++<|?=^r+=<*|*<<+==*7L*<*|Li
~~^*|?>+=^^;;^==+|L*=*+!+*?*>+<+=+=<=>=^+=rr==++*?<+^++=^^^r==**<<=^+^r+<<*<+><>r<?L|?<^^>z|******

```
