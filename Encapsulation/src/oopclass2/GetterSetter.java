package oopclass2;

class Project {
    private int pId,projectDuration;
    private String projectName;
    
    public int getPId() {
        return pId;
    }
    
    public void setPId(int value) {
        if(value%2==0) {
            pId = value;
        }
        else {
            System.out.println("Project ID should be an even number.");
        }
    }
    
    public String getProjectName() {
        return projectName;
    }
    
    public void setProjectName(String name) {
        projectName = name;
    }
    
    public void setProjectDuration(int value) {
        projectDuration = value;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        Project project1 = new Project();
        
    }
}
