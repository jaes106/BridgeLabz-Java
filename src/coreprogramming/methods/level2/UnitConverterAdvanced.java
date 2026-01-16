package coreprogramming.methods.level2;
class UnitConverterAdvanced {

    static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println(convertFahrenheitToCelsius(98.6));
        System.out.println(convertKgToPounds(70));
    }
}
