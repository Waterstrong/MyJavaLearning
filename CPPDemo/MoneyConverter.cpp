

#include <iostream>
#include <string>
using namespace std;
template<typename T>
class Money
{
	protected:
	float m_value;
	public:	
	Money(int value)
	{
		m_value = value;
	}
	virtual ~Money(){}
	float getValue()
	{
		return m_value;
	}
	void setValue(float value)
	{
		m_value = value;
	}
	void ShowMoney()
	{
		cout<<m_value<<getMoneyName()<<endl;
	}
	template<typename U>
	T Add( const Money<U>* money)
	{
		float value = getValue() + getTargetValue(money->getBaseDollarValue());
		T newType(value);
		return newType;
	}
	virtual string getMoneyName() const = 0;
	//protected:
	float getBaseDollarValue() const
	{
		return m_value * getDollarRate();
	}
	float getTargetValue(float value) const
	{
		return value / getDollarRate();
	}
	virtual float getDollarRate() const = 0;
};

class Dollar : public Money<Dollar>
{
	public:
	Dollar(int value):Money<Dollar>(value)
	{
	}
	protected:
	float getDollarRate() const
	{
		return 1.0f;
	}
	string getMoneyName() const
	{
		return " Dollar";
	}
};

class RMB : public Money<RMB>
{
	
	public:
	RMB(int value):Money<RMB>(value)
	{
	}
	string getMoneyName() const
	{
		return " RMB";
	}
	protected: 
	float getDollarRate() const
	{
		return (1.0f/6.0f);
	}
};


int main()
{	
	RMB rmb(6);
	Dollar dollar(6);
	Money<RMB> * operandA;
	Money<Dollar>* operandB;
	operandA = &rmb;
	operandB = &dollar;
	RMB rmbTmp = operandA->Add(operandB);
	rmbTmp.ShowMoney();
	
	return 0;
}
