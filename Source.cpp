#include <iostream>
#include <string>
using namespace std;










class runLengthE
{
public:
	string encode(string str);


};
string runLengthE :: encode(string str)
{
	string strF = "";
	int sameCount = 1;
	int j = 1;
	for (int i = 0; i < str.length(); i++)
	{
		int sameCount = 1;
		int j = 1;

		while ((j + i) != str.length() && str.at(i) == str.at(i + j))
		{

			sameCount++;
			j++;

		}
		if (sameCount <= 4)
		{
			strF += str.at(i);
		}
		if (sameCount > 4)
		{

			strF += "/";
			if (sameCount < 10)
			{
				strF += "0";
			}
			std::string s = std::to_string(sameCount);
			strF += s;
			strF += str.at(i);
			sameCount -= 1;
			i += (sameCount);
		}
	}
	return strF;
}


int main()
{
	string str;
	cout << "Please enter a string to encode \n";

	cin >> str;
	runLengthE s;
	cout << s.encode(str);

}