package Service;

import Dto.MovieDTO;
import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<MovieDTO> findAll();

    Optional<MovieDTO> findById(Long id);

    MovieDTO save(MovieDTO movieDTO);

    MovieDTO update(MovieDTO movieDTO);

    void delete(Long id);

}