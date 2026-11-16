package com.workintech.developers;

public class HRManager extends Employee{
    public HRManager(long id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 1000);
    }

    JuniorDeveloper[] juniorDeveloper = new JuniorDeveloper[10];
    MidDeveloper[] midDeveloper = new MidDeveloper[10];
    SeniorDeveloper[] seniorDeveloper = new SeniorDeveloper[10];

    public void addEmployee(JuniorDeveloper employee){
        boolean added = false;
        for(int i = 0; i < juniorDeveloper.length; i++){
            if(juniorDeveloper[i] == null){
                juniorDeveloper[i] = employee;
                added = true;
                break;
            }
        }
        if(!added){
            System.out.println("No available index for HR Manager");
        }
    }
    public void addEmployee(MidDeveloper employee){
        boolean added = false;
        for(int i = 0; i < midDeveloper.length; i++){
            if(midDeveloper[i] == null){
                midDeveloper[i] = employee;
                added = true;
                break;
            }
        }
        if(!added){
            System.out.println("No available index for Mid Developer");
        }
    }
    public void addEmployee(SeniorDeveloper employee){
        boolean added = false;
        for(int i = 0; i < seniorDeveloper.length; i++){
            if(seniorDeveloper[i] == null){
                seniorDeveloper[i] = employee;
                added = true;
                break;
            }
        }
        if(!added){
            System.out.println("No available index for Senior Developer");
        }
    }
}