#include "Address.h"

Address::Address() : street(""), city(""), pin(0) {}

Address::Address(string st, string ct, int p) {
    street = st;
    city = ct;
    pin = p;
}

Address::Address(const Address &a) {
    street = a.street;
    city = a.city;
    pin = a.pin;
}

Address::~Address() {}

void Address::display() {
    cout << "Street: " << street << ", City: " << city << ", Pin: " << pin << endl;
}
