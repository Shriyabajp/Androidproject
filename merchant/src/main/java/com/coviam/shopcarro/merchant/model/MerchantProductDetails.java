package com.coviam.shopcarro.merchant.model;

import com.coviam.shopcarro.merchant.dto.StockDetailsDto;

import java.util.Objects;

/**
 * @author sreerajr
 * @package com.coviam.shopcarro.merchant.model
 * @project merchant
 */
public class MerchantProductDetails {
    private String merchantName;
    private String price;

    public MerchantProductDetails(StockDetailsDto stockDetailsDto) {
        this.merchantName = stockDetailsDto.getMerchantName();
        this.price = String.valueOf(stockDetailsDto.getProductPrice());
    }

    public MerchantProductDetails(String merchantName, String price) {
        this.merchantName = merchantName;
        this.price = price;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "MerchantProductDetails{" +
                "merchantName='" + merchantName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MerchantProductDetails that = (MerchantProductDetails) o;
        return Objects.equals(merchantName, that.merchantName) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(merchantName, price);
    }
}
