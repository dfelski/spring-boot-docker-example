package example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Very basic HTTP controller.
 */
@RestController
class ExampleController {

    @GetMapping("/")
    SimpleModel getSimpleModel(){
        return new SimpleModel("dummy");
    }

    @GetMapping("/{name}")
    SimpleModel getSimpleModel(@PathVariable String name){
        return new SimpleModel(name);
    }

}
