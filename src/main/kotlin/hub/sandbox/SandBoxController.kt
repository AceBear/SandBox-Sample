package hub.sandbox

import org.springframework.web.bind.annotation.*

@RestController
class SandBoxController {
    @RequestMapping("/api/SandBox/hello-world/get-value/org/{oid}")
    fun GetHelloWorld(@PathVariable oid:String):String{
        return "HelloWorld"
    }
}