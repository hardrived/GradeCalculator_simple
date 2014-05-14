/*
 * Copyright (C) 2014 Eduardo Robles <eduardorobles02 at gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package gradecalculator_simple;

import java.util.Scanner;

/**
 *
 * @author Eduardo Robles <eduardorobles02 at gmail.com>
 */
public class GradeCalculator_simple {

    /**
     * @param args the command line arguments
     */
        
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        /**/
        double percent_one = 0;
        double percent_two = 0;
        double percent_three = 0;
        double percent_four = 0;
        double gradeAssingments = 0;
        double gradeProject = 0;
        double gradeMidterm = 0;
        double gradeFinal = 0;
        double modAssignment;
        double modProject;
        double modMidterm;
        double modFinal;
        double Finalgrade;
        
        //Display Percentage information to the user
        System.out.printf("Please enter a Percentage for Assignments: ", percent_one);//Input Percentage for Assingments
        percent_one = input.nextDouble();
        
        System.out.printf("Please enter a Percentage for Project: ", percent_two);//Input Percentage for Project
        percent_two = input.nextDouble();
        
        System.out.printf("Please enter a Percentage for Midterm: ", percent_three);//Input Percentage for Midterm
        percent_three = input.nextDouble();
        
        System.out.printf("Please enter a Percentage for Final: ", percent_four);//Input Percentage for Final Grade
        percent_four = input.nextDouble();
        
        //Display Grade information to the user
        System.out.printf("\nPlease enter a grade: ", gradeAssingments);//Input Assingment Grade
        gradeAssingments = input.nextDouble();
        
        System.out.printf("Please enter a grade: ", gradeProject);//Input Project Grade
        gradeProject = input.nextDouble();
        
        System.out.printf("Please enter grade: ", gradeMidterm);//Input Midterm Grade
        gradeMidterm = input.nextDouble();
        
        System.out.printf("Please enter a grade: ", gradeFinal);//Input Final Grade
        gradeFinal = input.nextDouble();
        
        
        //Calculate percentage grade per assignemnt or exam ei. (percentGrade = gradeAssignmnet / 100)
        modAssignment = gradeAssingments / 100;
        modProject = gradeProject / 100;
        modMidterm = gradeMidterm / 100;
        modFinal = gradeFinal / 100;
        
        //Calculate Final Grade
        //Fixed percentages per assignments
        Finalgrade = ((modAssignment * percent_one) + (modProject * percent_two) + (modMidterm * percent_three) + (modFinal * percent_four));
        
        //Print to screen Final Grade
        System.out.printf("Here is your Final Grade: %f ", Finalgrade);
        
               
    }//end main methond
    
}//end main class
 