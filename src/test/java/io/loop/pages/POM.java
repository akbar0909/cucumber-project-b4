package io.loop.pages;

public class POM {
    private LoginPage loginPage;
    private GoogleSearchPage googlesearchpage;
    private ProductPage productpage;
    private SmartBearOrderPage smartBearOrderPage;

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public GoogleSearchPage getGooglesearchpage() {
        if (googlesearchpage == null) {
            googlesearchpage = new GoogleSearchPage();

        }
        return googlesearchpage;
    }

    public ProductPage getProductpage() {
        if (productpage == null) {
            productpage = new ProductPage();

        }
        return productpage;
    }


        public SmartBearOrderPage getSmartBearOrderPage () {
            if (smartBearOrderPage == null) {
                smartBearOrderPage = new SmartBearOrderPage();
            }
            return smartBearOrderPage;
        }



}
