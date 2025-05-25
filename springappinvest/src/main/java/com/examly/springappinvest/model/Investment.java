import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;

@Entity
public class Investment {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long InvestmentId;
private String name;
private String description;
private String type;
private Double purchasePrice;
private Double currentPrice;
private Integer quantity;
private String purchaseDate;
private String status;
public Long getInvestmentId() {
    return InvestmentId;
}
public void setInvestmentId(Long investmentId) {
    InvestmentId = investmentId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getDescription() {
    return description;
}
public void setDescription(String description) {
    this.description = description;
}
public String getType() {
    return type;
}
public void setType(String type) {
    this.type = type;
}
public Double getPurchasePrice() {
    return purchasePrice;
}
public void setPurchasePrice(Double purchasePrice) {
    this.purchasePrice = purchasePrice;
}
public Double getCurrentPrice() {
    return currentPrice;
}
public void setCurrentPrice(Double currentPrice) {
    this.currentPrice = currentPrice;
}
public Integer getQuantity() {
    return quantity;
}
public void setQuantity(Integer quantity) {
    this.quantity = quantity;
}
public String getPurchaseDate() {
    return purchaseDate;
}
public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
}
public String getStatus() {
    return status;
}
public void setStatus(String status) {
    this.status = status;
}
public Investment(Long investmentId, String name, String description, String type, Double purchasePrice,
        Double currentPrice, Integer quantity, String purchaseDate, String status) {
    InvestmentId = investmentId;
    this.name = name;
    this.description = description;
    this.type = type;
    this.purchasePrice = purchasePrice;
    this.currentPrice = currentPrice;
    this.quantity = quantity;
    this.purchaseDate = purchaseDate;
    this.status = status;
}
public Investment() {
}


}
