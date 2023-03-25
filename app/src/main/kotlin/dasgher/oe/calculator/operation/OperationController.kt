package dasgher.oe.calculator.operator

import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import Operation

@RestController
class OperationController {

    @GetMapping("/history")
    fun hello(): List<Operation> {
        return listOf(
            Operation(1,2,InstructionType.SUM, 3),
            Operation(1,4,InstructionType.SUBTRACTION, -3)
        )
    }

    @PostMapping("/sum")
    fun blog(): String {
        return "blog"
    }

}