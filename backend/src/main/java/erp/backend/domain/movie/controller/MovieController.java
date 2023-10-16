package erp.backend.domain.movie.controller;

import erp.backend.domain.movie.entity.Movie;
import erp.backend.domain.movie.repository.MovieRepository;
import erp.backend.domain.movie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movie")
public class MovieController{

   // @Value("${movie.key}")
    String key;
    private final MovieService movieService;
    private final MovieRepository movieRepository;

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable String id) {
        Movie movie = movieRepository.findById(id).orElse(null); //매핑, 레포지토리 -> 서비스로 수정예정
        return movie;
    }
    @ResponseBody
    @GetMapping("/getInfo")
    public String getInfo() {
        int pages = 1;
        try {
            for (int i = 1; i <= 1; i++) {
                String apiURL = "https://api.themoviedb.org/3/discover/movie?api_key=" + key
                        + "&release_date.gte=2000-01-01&watch_region=KR&language=ko&page=" + i;
                URL url = new URL(apiURL);
                BufferedReader bf;
                bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
                String result = bf.readLine();
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@"+result);
                movieService.getInfo(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "ok";
    }
}

