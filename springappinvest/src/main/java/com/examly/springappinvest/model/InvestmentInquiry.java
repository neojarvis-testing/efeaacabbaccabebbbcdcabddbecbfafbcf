import java.lang.annotation.Inherited;
import java.time.LocalDateTime;

import javax.annotation.processing.Generated;

@Entity
public class InvestmentInquiry {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long inquiryId;
@ManyToOne
@JoinColumn(name="userId",nullable=false)
private User user;
@ManyToOne
@JoinColumn(name="investmentId",nullable=false)
private Investment investment;
private String message;
private String status;
private String priority;
private LocalDateTime inquiryDate;
private LocalDateTime responseDate;
private String adminResponse;
print String contactDetails;


}
