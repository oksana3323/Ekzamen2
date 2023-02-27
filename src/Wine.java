import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Wine implements Bino {
 private String name;
 private String brand;
 private String country;
 private LocalDate dateOfMade;

 public Wine(String name, String brand, String country, LocalDate dateOfMade) {
  this.name = name;
  this.brand = brand;
  this.country = country;
  this.dateOfMade = dateOfMade;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getCountry() {
  return country;
 }

 public void setCountry(String country) {
  this.country = country;
 }

 public LocalDate getDateOfMade() {
  return dateOfMade;
 }

 public void setDateOfMade(LocalDate dateOfMade) {
  this.dateOfMade = dateOfMade;
 }

 @Override
 public void calculationOfExposure(LocalDate date) {
  System.out.println(Period.between(dateOfMade, LocalDate.now()).getYears());
 }

 @Override
 public String toString() {
  return "Wine{" +
          "name='" + name + '\'' +
          ", brand='" + brand + '\'' +
          ", country='" + country + '\'' +
          ", dateOfMade=" + dateOfMade +
          '}';
 }
}
