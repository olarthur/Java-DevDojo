package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("A.G")
                .lastName("Sertillanges")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .contry(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);

    }
}
