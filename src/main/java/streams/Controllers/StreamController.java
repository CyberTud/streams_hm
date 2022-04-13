package streams.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import streams.Services.StreamService;

@RestController
@RequestMapping("stream")
@RequiredArgsConstructor
public class StreamController {

    private final StreamService streamService;
    @GetMapping("/show") // show all streams
    public String getStream() {
        return streamService.getStream().toString();
    }

    @GetMapping("/filter-by-age")
    public  String filterByAge() {
        return streamService.getByAge().toString();
    }

    @GetMapping("/get-youngest")
    public String filtertYoungest() {
        return streamService.getYoungestUser().toString();
    }

    @GetMapping("/get-oldest")
    public String filterOldest() {
        return streamService.getOldestUser().toString();
    }

    @GetMapping("/remove-duplicates")
    public String removeDuplicates() {
        return streamService.getByRemovingDuplicates().toString();
    }

    @GetMapping("/sort-by-age")
    public String sortByAge() {
        return streamService.getBySorting().toString();
    }
}
