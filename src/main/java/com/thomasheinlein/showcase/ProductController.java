package com.thomasheinlein.showcase;

import com.google.common.collect.ImmutableList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<ProductDto> get() {
        return ImmutableList.of(
                new ProductDto("iPhone", 1000),
                new ProductDto("MacBook", 2000)
        );
    }

}
