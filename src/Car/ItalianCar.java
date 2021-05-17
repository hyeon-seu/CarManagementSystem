package Car;

import java.util.Scanner;

import excception.YearFomatException;

public class ItalianCar extends UnknownCar{
	protected int Kyear;

	public ItalianCar(CarKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setCarID(input);
		setCarName(input);
		setCarYearwithYN(input);
		setCarKorYearwithYN(input);
		setCarPrice(input);
	}
	public void setCarKorYearwithYN(Scanner input){
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Do you know when this car came to Korea? (Y/N) : ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setCarYear(input);
					break;
				}
				else if(answer == 'n' || answer == 'N') {
					this.setYear(0000);
					break;
				}
				else {
				}
			}
			catch(YearFomatException e) {
				System.out.println("Enter only the year after 1950!!");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind :" + skind +"id : " + this.id +  "  name : " + this.name + "  year : " + this.year + "  price($) : " + this.price + " K year : " + this.year );
	}

	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Korean :
			skind = "Korean.";
			break;
		case German:
			skind = "German.";
			break;
		case American:
			skind = "American.";
			break;
		case ltalian :
			skind = "Italian.";
			break;
		default:
		}
		return skind;
	}

}
