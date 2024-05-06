public class employeesWhoMetTargetHours {
    public static void main(String[] args) {
        int[] hoursPerEmployee = new int[]{0,1,2,3,4}; // each index is a different employee, number represents the hours worked
        int targetHours = 2;
        for (int i = 0; i < hoursPerEmployee.length; i++) { // small loop to show all employees' hours worked
            System.out.println("Employee #" + (i+1) + ": " + hoursPerEmployee[i]);
        }
        System.out.println("Target Hours: " + targetHours);
        System.out.println("Number of employees that hit target hours: " + numberOfEmployeesWhoMetTarget(hoursPerEmployee, targetHours));
    }
    protected static int numberOfEmployeesWhoMetTarget(int[] hours, int target){
        int count = 0; // keeping a count of how many employees made the target
        for( int employeeHoursDone: hours){ // for each employee in the array, compare target hours with hours worked
            if(employeeHoursDone >= target){
                count++;
            }
        }
        return count;

    }
}
