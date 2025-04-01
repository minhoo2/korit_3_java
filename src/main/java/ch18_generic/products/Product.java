package ch18_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;
/*
    ProductController.java를 생성하시고, 다양한 타입의
    상품정보를 저장하고 출력하는 코드를 작성하시오.
 */
@Data
@AllArgsConstructor
public class Product <T> {
    private String productName;
    private T productInfo;
}
