package fr.wildcodeschool.blablawild;

import java.util.Date;




    public class TripModel {

        private String driverfirstname;
        private String driverLastname;
        private Date date;
        private int price;

        public TripModel(String driverfirstname, String driverLastname, Date date, int price){
            this.driverfirstname = driverfirstname;
            this.driverLastname = driverLastname;
            this.date = date;
            this.price = price;

        }

        public String getDriverfirstname() {
            return driverfirstname;
        }

        public String getDriverLastname() {
            return driverLastname;
        }

        public Date getDate() {
            return date;
        }

        public int getPrice() {
            return price;
        }

        public void setDriverfirstname(String driverfirstname) {
            this.driverfirstname = driverfirstname;
        }

        public void setDriverLastname(String driverLastname) {
            this.driverLastname = driverLastname;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }



