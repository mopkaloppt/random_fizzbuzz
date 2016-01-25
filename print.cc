#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int Print(int n) {
	
	if (n%3 == 0 && n%5 == 0) {
		cout << n << ": FizzBuzz" << endl;

	}
	if (n%3 == 0) {		
		cout << n << ": Fizz" << endl; 		
	}
	if (n%5 == 0) {
		cout << n << ": Buzz" << endl;
	}
	else {
		cout << n << endl;
	}
}


int main(int argc, char *argv[]) {

	for(int j=1; j <= 100; j++) {
		
		Print(j);
	}
	
}

