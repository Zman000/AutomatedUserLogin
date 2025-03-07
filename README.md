# Automated Network Login Script

## Overview
This project automates the login process for an institutional network using Selenium WebDriver. It ensures seamless authentication without manual intervention.

## Features
- Automated login using Selenium WebDriver
- Uses a batch (`.bat`) file to execute the script
- Integrated with Task Scheduler for automatic execution
- Implements TestNG for verification of successful login attempts

## Prerequisites
The following are the dependencies of the script:
- **Java Development Kit (JDK)**
- **Selenium WebDriver**
- **TestNG**
- **Microsoft Edge WebDriver**

## Installation & Setup
1. **Clone the Repository:**  
   ```sh
   git clone https://github.com/Zman00089/AutomatedUserLogin
   cd AutomatedUserLogin
   ```

2. **Set Up Dependencies:**  
   Ensure that Selenium, TestNG, and the required WebDriver are correctly placed in the project directory.

3. **Configure Credentials:**  
   - Edit the `credentials.txt` file (or the designated credentials storage file) to include your login details.

4. **Run the Script Using the Batch File:**  
   - Double-click `run_script.bat` to execute the login process.

5. **Automate Execution with Task Scheduler (Optional):**  
   - Add `run_script.bat` to Windows Task Scheduler for automatic execution at specified intervals.

## Usage
Once set up, the script will automatically log in to the network whenever executed, either manually via the batch file or through Task Scheduler.

## Future Improvements
- Enhance credential security
- Implement multi-browser support


