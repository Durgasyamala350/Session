package shopping;

public class ShoppingCard {
private int CardNumber;
private String CardName;
public ShoppingCard(int cardNumber, String cardName) {
	super();
	CardNumber = cardNumber;
	CardName = cardName;
}
public ShoppingCard() {
	super();
}

public int getCardNumber() {
	return CardNumber;
}
public void setCardNumber(int cardNumber) {
	CardNumber = cardNumber;
}
public String getCardName() {
	return CardName;
}
public void setCardName(String cardName) {
	CardName = cardName;
}
@Override
public String toString() {
	return "ShoppingCard [CardNumber=" + CardNumber + ", CardName=" + CardName + "]";
}

}
