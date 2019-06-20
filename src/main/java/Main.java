/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicboutte
 */
public class Main {
    public static void main(string[] args) throws exception{
    HttpResponse<String> response = Unirest.get("http://https:/d38589f665000363cd7899ada27d89600f988e3196151b4f5729d2fb03219174:@api.hellosign.com/v3/template/58b76c5b04888dd7ed0359c887256a0334e705e0")
  .header("cache-control", "no-cache")
  .header("Postman-Token", "b9d9e981-ed1f-4be4-925d-0bc1723232e3")
  .asString();
    }
    
}


<dependency>
    <groupId>com.mashape.unirest</groupId>
    <artifactId>unirest-java</artifactId>
    <version>1.4.9</version>
</dependency>