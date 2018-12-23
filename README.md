# Selenium WebDriver sample.
The code performs the following steps:
1. Open Chrome browser;
2. Navigates to "https://google.com";
3. Searches for "yandex.ru"
4. Validates that first search results meets the following criteria:
  - adverts aren't considered as a search result
  - the link of the first result leads to "yandex.ru" website

## Getting Started

### Prerequisites
1. Install the latest JDK as described here: https://docs.oracle.com/javase/7/docs/webnotes/install/windows/jdk-installation-windows.html
2. Install the latest Maven tool as described here: https://maven.apache.org/install.html
3. Install the latest ChromeDriver as described here: http://chromedriver.chromium.org/getting-started
4. Download the project sources to your machine and move it to any suitable directory'

### Running Test
1. in CMD: Execute "cd [project directory folder path]" command
2. in CMD: Execute "mvn test" command

in case the test ran successfully you will see one succeded result in maven's cmd interface
