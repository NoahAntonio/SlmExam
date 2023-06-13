package at.technikum.slmexam;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@RestController
public class DigitCalculator {
    @GetMapping("/digitSum")
    public int digitSum(@RequestParam int a){
        int sum = 0;
        while(a > 0){
            int digit = a%10;
            a = a/10;
            sum += digit;
        }
        return sum;


    }
}
