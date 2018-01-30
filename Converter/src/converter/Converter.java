
package converter;
import java.util.Scanner;

public class Converter {

                void kmtomiles(double km){
		double miles = km/8*5;
		System.out.println(km+"km ="+miles+"miles");
		}
		void milestokm(double miles){
		double km = miles/5*8;
		System.out.println(miles+"miles ="+km+"km");
		}

		void CelsiusToFahrenheit(double Celsius){
		double Fahrenheit = 9/5*Celsius+32;
		System.out.println(Celsius+"Celsius = "+Fahrenheit+"Fahrenheit");
		}
		void FahrenheitToCelsius(double Fahrenheit){
		double Celsius = 5/9*(Fahrenheit-32);
		System.out.println(Fahrenheit+"Fahrenheit = "+Celsius+"Celsius");
		}

		void KilogramsToPounds(double Kilograms){
		double Pounds = Kilograms*2.20462;
		System.out.println(Kilograms+"Kilograms = "+Pounds+"Pounds");
		}
		void PoundsToKilograms(double Pounds){
		double Kilograms = Pounds/2.20462;
		System.out.println(Pounds+"Pounds = "+Kilograms+"Kilograms");
		}

		void MetersToFeet(double Meters){
		double Feet = Meters*3.28084;
		System.out.println(Meters+"Meters = "+Feet+"Feet");
		}
		void FeetToMeters(double Feet){
		double Meters = Feet/3.28084;
		System.out.println(Feet+"Feet = "+Meters+"Meters");
		}

		void InchesToCentimeters(double Inches){
		double Centimeters = Inches*2.54;
		System.out.println(Inches+"Inches = "+Centimeters+"Centimeters");
		}
		void CentimetersToInches(int Centimeters){
		double Inches = Centimeters/2.54;
		System.out.println(Centimeters+"Centimeters = "+Inches+"Inches");
		}

		void InchesToFeet(double Inches){
		double Feet = Inches/12;
		System.out.println(Inches+"Inches = "+Feet+"Feet");
		}
		void FeetToInches(double Feet){
		double Inches = Feet*12;
		System.out.println(Feet+"Feet = "+Inches+"Inches");
		}

		void kmhToms(double kmh){
		double ms = kmh/18*5;
		System.out.println(kmh+"kmh = "+ms+"ms");
		}
		void msTokmh(double ms){
		double kmh = ms/5*18;
		System.out.println(ms+"ms = "+kmh+"kmh");
		}

		void InchesTomilimetres(double Inches){
		double milimetres = Inches*25.4;
		System.out.println(Inches+"Inches = "+milimetres+"milimetres");
		}
		void milimetresToInches(double milimetres){
		double Inches = milimetres/25.4;
		System.out.println(milimetres+"milimetres = "+Inches+"Inches");
		}

		void yardTometres(double yard){
		double metres = yard*0.9144;
		System.out.println(yard+"yard = "+metres+"metres");
		}
		void metresToyard(double metres){
		double yard = metres/0.9144;
		System.out.println(metres+"metres = "+yard+"yard");
		}

		void GallonTolitres(double Gallon){
		double litres = Gallon*4.546;
		System.out.println(Gallon+"Gallon = "+litres+"litres");
		}
		void litresToGallon(double litres){
		double Gallon = litres/4.546;
		System.out.println(litres+"litres = "+Gallon+"Gallon");
		}

		void ounceTograms(double ounce){
		double grams = ounce*28.35;
		System.out.println(ounce+"ounce = "+grams+"grams");
		}
		void gramsToounce(double grams){
		double ounce = grams/28.35;
		System.out.println(grams+"grams = "+ounce+"ounce");
		}

		void poundsTograms(double pounds){
		double grams = pounds*453.592;
		System.out.println(pounds+"pounds = "+grams+"grams");
		}
		void gramsTopounds(double grams){
		double pounds = grams/453.592;
		System.out.println(grams+"grams = "+pounds+"pounds");
		}
    
    public static void main(String[] args) {
        
        Scanner s =new Scanner(System.in);

	for(;;){
	System.out.println("................................................................................");
	System.out.println("*******************************WELCOME TO CONVERTER*****************************");
	System.out.println("");
	System.out.println("		INSTRUCTIONS..>>>");

	System.out.println("");
	System.out.println("				Km To Miles:1");
	System.out.println("				Celsius To Fahrenheit:2");
	System.out.println("				Kilograms To Pounds:3");
	System.out.println("				Meters To Feet:4");
	System.out.println("				Inches To Centimeters:5");
	System.out.println("				Inches To Feet:6");
	System.out.println("				kmh To ms:7");
	System.out.println("				Inches To milimetres:8");
	System.out.println("				yard To metres:9");
	System.out.println("				Gallon To litres:10");
	System.out.println("				ounce To grams:11");
	System.out.println("				pounds To grams:12");
	System.out.println("");

				System.out.print("Enter the Number:");

		int firstinput=s.nextInt();
		int secondinput=0;
		int thirdinput=0;

						Converter t=new Converter();

				if(firstinput == 1){
					System.out.println("");
					System.out.println("			Convert Km to Miles-1");
					System.out.println("			Convert Miles to Km-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Km:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.kmtomiles(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("miles:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.milestokm(thirdinput);
					}//sub if

				}else if(firstinput == 2){
					System.out.println("");
					System.out.println("			Convert Celsius to Fahrenheit-1");
					System.out.println("			Convert Fahrenheit to Celsius-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Celsius:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.CelsiusToFahrenheit(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("Fahrenheit:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.FahrenheitToCelsius(thirdinput);
					}//sub if

				}else if(firstinput == 3){
					System.out.println("");
					System.out.println("			Convert Kilograms to Pounds-1");
					System.out.println("			Convert Pounds to Kilograms-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Kilograms:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.KilogramsToPounds(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("Pounds:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.PoundsToKilograms(thirdinput);
					}//sub if

				}else if(firstinput == 4){
					System.out.println("");
					System.out.println("			Convert Meters to Feet-1");
					System.out.println("			Convert Feet to Meters-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Meters:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.MetersToFeet(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("Feet:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.FeetToMeters(thirdinput);
					}//sub if

				}else if(firstinput == 5){
					System.out.println("");
					System.out.println("			Convert Inches to Centimeters-1");
					System.out.println("			Convert Centimeters to Inches-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Inches:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.InchesToCentimeters(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("Centimeters:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.CentimetersToInches(thirdinput);
					}//sub if

				}else if(firstinput == 6){
					System.out.println("");
					System.out.println("			Convert Inches to Feet-1");
					System.out.println("			Convert Feet to Inches-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Inches:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.InchesToFeet(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("Feet:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.FeetToInches(thirdinput);
					}//sub if

				}else if(firstinput == 7){
					System.out.println("");
					System.out.println("			Convert kmh to ms-1");
					System.out.println("			Convert ms to kmh-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("kmh:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.kmhToms(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("ms:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.msTokmh(thirdinput);
					}//sub if

				}else if(firstinput == 8){
					System.out.println("");
					System.out.println("			Convert Inches to milimetres-1");
					System.out.println("			Convert milimetres to Inches-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Inches:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.InchesTomilimetres(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("milimetres:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.milimetresToInches(thirdinput);
					}//sub if

				}else if(firstinput == 9){
					System.out.println("");
					System.out.println("			Convert yard to metres-1");
					System.out.println("			Convert metres to yard-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("yard:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.yardTometres(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("metres:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.metresToyard(thirdinput);
					}//sub if

				}else if(firstinput == 10){
					System.out.println("");
					System.out.println("			Convert Gallon to litres-1");
					System.out.println("			Convert litres to Gallon-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("Gallon:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.GallonTolitres(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("litres:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.litresToGallon(thirdinput);
					}//sub if

				}else if(firstinput == 11){
					System.out.println("");
					System.out.println("			Convert ounce to grams-1");
					System.out.println("			Convert grams to ounce-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("ounce:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.ounceTograms(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("grams:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.gramsToounce(thirdinput);
					}//sub if

				}else if(firstinput == 12){
					System.out.println("");
					System.out.println("			Convert pounds to grams-1");
					System.out.println("			Convert grams to pounds-2");
					System.out.println("");
					System.out.print("Make the Selection:");
					secondinput=s.nextInt();

					if(secondinput == 1){		//sub if
						System.out.println("");
						System.out.print("pounds:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.poundsTograms(thirdinput);

					}else if(secondinput == 2){
						System.out.println("");
						System.out.print("grams:");
						System.out.print("");
						thirdinput=s.nextInt();
						t.gramsTopounds(thirdinput);
					}//sub if

				}//if

					System.out.println("");
					System.out.print("Exit(Y/N):");
					String Exit = s.next();
					if(Exit.equalsIgnoreCase("Y")){
                                        System.out.println("");
                                        System.out.println("Thank You for using Programme.....");
								break;
					}else if(Exit.equalsIgnoreCase("N")){
								continue;
					}
			}
        
    }
}
