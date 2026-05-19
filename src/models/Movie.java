package models;

public class Movie {
  public String name;
  public int year;
  public Movie() {
  }
  public Movie(String name, int year) {
    this.name = name;
    this.year = year;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  @Override
  public String toString() {
    return "Movie [name=" + name + ", year=" + year + "]";
  }
  

}
