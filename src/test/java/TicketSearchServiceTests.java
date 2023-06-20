
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.BDDMockito.given;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.ticketing.dto.TheaterDetailsDTO;
import org.ticketing.entity.TheaterDetails;
import org.ticketing.repository.ITheaterSearchRepository;
import org.ticketing.service.TheaterSearchService;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TicketSearchServiceTests {

    @Mock
    private ITheaterSearchRepository iTheaterSearchRepository;

    @InjectMocks
    private TheaterSearchService theaterSearchService;

    private TheaterDetails theaterDetails;

    @BeforeEach
    public void setup(){

        theaterDetails = new TheaterDetails(1L,"Rakesh","Annamalai","11:30,12:30","17-06-2023");

    }



    @DisplayName("JUnit test for getAllTheaters method")
    @Test
    public void givenTheaterList_whenGetAllTheaters_thenReturnTheatersList(){
        // given - precondition or setup

        TheaterDetails theaterDetails1 = new TheaterDetails(2L,"Rakesh","Annamalai","11:30,12:30","17-06-2023");

        given(iTheaterSearchRepository.findAll()).willReturn(List.of(theaterDetails,theaterDetails1));

        // when -  action or the behaviour that we are going test
        List<TheaterDetailsDTO> theaterList = theaterSearchService.findAll();

        // then - verify the output
        assertThat(theaterList).isNotNull();
        assertThat(theaterList.size()).isEqualTo(2);
    }


    @DisplayName("JUnit test for getAllTheaters method (negative scenario)")
    @Test
    public void givenTheaterList_whenGetAllTheaters_thenReturnEmptyListTheatersList(){
        // given - precondition or setup

   /*     TheaterDetails theater1 = new TheaterDetails(2L,"Rakesh","Annamalai","11:30,12:30","17-06-2023");*/

        given(iTheaterSearchRepository.findAll()).willReturn(Collections.emptyList());

        // when -  action or the behaviour that we are going test
        List<TheaterDetailsDTO> theaterList = theaterSearchService.findAll();

        // then - verify the output
        assertThat(theaterList).isEmpty();
        assertThat(theaterList.size()).isEqualTo(0);
    }

}

