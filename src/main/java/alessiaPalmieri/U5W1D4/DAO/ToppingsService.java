package alessiaPalmieri.U5W1D4.DAO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ToppingsService {
    @Autowired
    private ToppingsDAO toppingsDAO;
}
