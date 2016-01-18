package week06;

import java.util.List;
import java.util.Queue;

public class BankAccount {

	private static Queue<String> _operations;

	private int _uniqueNumber;
	private String _firstName;
	private String _lastName;
	private short _age;
	private double _balance;
	private double _interest;
	private String _interestType;

	public BankAccount(int _uniqueNumber, String _firstName, String _lastName,
			short _age, long _balance, double _interest, String _interestType) {
		this._uniqueNumber = _uniqueNumber;
		this._firstName = _firstName;
		this._lastName = _lastName;
		this._age = _age;
		this._balance = _balance;
		this._interest = _interest;
		this._interestType = _interestType;
	}

	public int get_uniqueNumber() {
		return _uniqueNumber;
	}

	public String get_firstName() {
		return _firstName;
	}

	public String get_lastName() {
		return _lastName;
	}

	public short get_age() {
		return _age;
	}

	public long get_balance() {
		return _balance;
	}

	public double get_interest() {
		return _interest;
	}

	public String get_interestType() {
		return _interestType;
	}

	public void add(long money) {
		this._balance += money;
		if (_operations.size() < 5) {
			_operations.add("added " + money);
		} else {
			_operations.poll();
			_operations.add("added " + money);

		}
	}

	public void withdraw(long money) {
		if (_interest < 1.0) {
			if (_balance - money > 0) {
				this._balance -= money;
			}else throw Exception;
		} else
			throw Exception;
		if (_operations.size() < 5) {
			_operations.add("withdrawed: " + money);
		} else {
			_operations.poll();
			_operations.add("withdrawed " + money);

		}
	}
}
