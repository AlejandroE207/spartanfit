/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ConectarBD {
    public DriverManagerDataSource conectar(){
        
        DriverManagerDataSource datasource = new DriverManagerDataSource();
    
        datasource.setDriverClassName("com.mysql.jdbc.Driver"); 
        datasource.setUrl("jdbc:mysql://localhost:3306/bdspartanfit?useSSL=false");
        datasource.setUsername("root");
        datasource.setPassword("alejandro2007");

        
        return datasource;
    }
}
