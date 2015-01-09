
package ejercicio2hospital;

/**
 *
 * @author Santiago
 */
public class Hospital extends Building {
    private String name;
    private String type;
    private int maxPatients;
    private int numberDoctors;

    
    @Override
    public String toString() {
        return "Hospital{" + "name=" + name + ", type=" + type + ", Max. number of patients=" + maxPatients + ", number of doctors employed=" + numberDoctors + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPatients() {
        return maxPatients;
    }

    public void setMaxPatients(int maxPatients) {
        this.maxPatients = maxPatients;
    }

    public int getNumberDoctors() {
        return numberDoctors;
    }

    public void setNumberDoctors(int numberDoctors) {
        this.numberDoctors = numberDoctors;
    }

    @Override
    public String buildingType() {
        return "Healthcare";
    }
    
    
}
