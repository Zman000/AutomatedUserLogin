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

3. **Configure Directory:**  
   - Edit the `runTest.bat` file to point to the directory where the source files are located

3. **Run the Script Using the Batch File:**  
   - Double-click `runTest.bat` to execute the login process.

4. **Automate Execution with Task Scheduler (Optional):**  
   - Add `runTest.bat` to Windows Task Scheduler for automatic execution at specified intervals.

## Usage
Once set up, the script will automatically log in to the network whenever executed, either manually via the batch file or through Task Scheduler.

## Future Improvements
- Automatic credential lookup from saved files
- Enhance credential security
- Implement multi-browser support


