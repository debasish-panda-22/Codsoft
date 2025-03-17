
# Student Grade Calculator

## Overview
The **Student Grade Calculator** is a Java console application that calculates a student's total marks, average percentage, and grade based on the marks obtained in multiple subjects.

## Features
- Accepts marks for multiple subjects.
- Calculates **Total Marks**.
- Computes **Average Percentage**.
- Assigns a **Grade** based on the percentage.
- Validates input to ensure marks are within 0-100.

## Grading Criteria
| Percentage Range | Grade |
|-----------------|-------|
| 90% - 100%     | A     |
| 80% - 89%      | B     |
| 70% - 79%      | C     |
| 60% - 69%      | D     |
| Below 60%      | F     |

## How to Use
1. Run the program.
2. Enter the number of subjects.
3. Input marks (out of 100) for each subject.
4. View the total marks, average percentage, and final grade.

## Installation & Execution
1. Ensure **Java JDK** is installed.
2. Clone or download the project files.
3. Open a terminal in the project directory.
4. Compile the program:
   ```sh
   javac StudentGradeCalculator.java
   ```
5. Run the program:
   ```sh
   java StudentGradeCalculator
   ```

## Example Output
```
Enter the number of subjects: 3
Enter marks obtained in subject 1 (out of 100): 85
Enter marks obtained in subject 2 (out of 100): 78
Enter marks obtained in subject 3 (out of 100): 92

--- Student Grade Report ---
Total Marks: 255
Average Percentage: 85.0%
Grade: B
```

## Contribution
Enhancements can be made by adding:
- Additional grading scales.
- A GUI-based version.
- Saving student results to a file.

## License
This project is open-source and available under the MIT License.
