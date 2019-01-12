package co.com.accenture.automation.screenplaychallenge.models;

public class Saving {

	private String purposeOfSaving;
	private short monthsOfTheSavingGoal;
	private String product;
	private float remainingMoneyToAchieveTheGoal;

	public String getPurposeOfSaving() {
		return purposeOfSaving;
	}

	public void setPurposeOfSaving(String purposeOfSaving) {
		this.purposeOfSaving = purposeOfSaving;
	}

	public short getMonthsOfTheSavingGoal() {
		return monthsOfTheSavingGoal;
	}

	public void setMonthsOfTheSavingGoal(short monthsOfTheSavingGoal) {
		this.monthsOfTheSavingGoal = monthsOfTheSavingGoal;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public float getRemainingMoneyToAchieveTheGoal() {
		return remainingMoneyToAchieveTheGoal;
	}

	public void setRemainingMoneyToAchieveTheGoal(float remainingMoneyToAchieveTheGoal) {
		this.remainingMoneyToAchieveTheGoal = remainingMoneyToAchieveTheGoal;
	}
}
