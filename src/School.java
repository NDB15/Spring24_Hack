public class School {
    private String name;
    private int population;

    public School(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public School(){
        name = null;
        population = 0;
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for population
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    // toString method to print School information
    @Override
    public String toString() {
        return "School: " + name + ", Population: " + population;
    }
}//end School class
