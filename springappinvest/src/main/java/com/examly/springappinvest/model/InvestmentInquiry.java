import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

@Entity
public class InvestmentInquiry {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long inquiryId;
private User user;
@ManyToOne
@JoinColumn(name="investmentId",nullable=false)
private Investment investment;


}
