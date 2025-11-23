#include"Seller.h"
#include"Product.h"

class SellerService{
    //static Seller sarr[100];
    //static int scount;

    public:
        static void AddSeller(int sid, string name);
        static void AddProduct(int sid, int pid, string pnm, double p );
        static void displaySellerProducts(int sid);
        static void displayAllSellers();
        static void displayAllProducts();
};