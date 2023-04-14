package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calculator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calculator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController // API 의 진입 지점으로 만들어줌
// 주어진 Class 를 Controller 로 등록한다. (Controller : API 의 입구)
public class CalculatorController {

    @GetMapping("/add")
    // 아래 함수를 HTTP Method 가 Get, HTTP path 가 /add 인 API 로 지정한다.
    public int addTwoNumbers(CalculatorAddRequest request) {
        return request.getNum1() + request.getNum2();
    }

//  public int addTwoNumbers(@RequestParam int num1, @RequestParam int num2) {
//        return num1 + num2; // @RequestParam : 주어진 쿼리를 함수 파라미터에 넣는다.
//    }


    @PostMapping("/multiply") // Post /multiply
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request) {
        return request.getNum1() * request.getNum2();
    } // @RequestBody : HTTP Body 로 들어오는 JSON 을 CalculatorMultiplyRequest 로 바꾼다.
}
