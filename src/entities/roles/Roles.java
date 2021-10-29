package entities.roles;

public class Roles {

	private Integer id;
	private String name;
	private boolean usesProvisory;
	private boolean sendEmailToVisited;
	private boolean receivesVisit;
	private boolean usedBySelfServiceTerminal;
	private Integer validateLevel; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateAntiPassbac; /// (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateStocking; /// (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateCreditAccess; /// (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateScaleRange; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateTimeBand; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateAuthorizerRole; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateAuthorizerPlace; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validateVacancy; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer validatePhysicallocation; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)
	private Integer checkCustomValidation; // (0=DISABLED, 1=ENABLED, 2=NOT_CONFIGURED)

	@Override
	public String toString() {
		return "Papeis [id=" + id + ", name=" + name + ", usesProvisory=" + usesProvisory + ", sendEmailToVisited="
				+ sendEmailToVisited + ", receivesVisit=" + receivesVisit + ", usedBySelfServiceTerminal="
				+ usedBySelfServiceTerminal + ", validateLevel=" + validateLevel + ", validateAntiPassbac="
				+ validateAntiPassbac + ", validateStocking=" + validateStocking + ", validateCreditAccess="
				+ validateCreditAccess + ", validateScaleRange=" + validateScaleRange + ", validateTimeBand="
				+ validateTimeBand + ", validateAuthorizerRole=" + validateAuthorizerRole + ", validateAuthorizerPlace="
				+ validateAuthorizerPlace + ", validateVacancy=" + validateVacancy + ", validatePhysicallocation="
				+ validatePhysicallocation + ", checkCustomValidation=" + checkCustomValidation + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isUsesProvisory() {
		return usesProvisory;
	}

	public void setUsesProvisory(boolean usesProvisory) {
		this.usesProvisory = usesProvisory;
	}

	public boolean isSendEmailToVisited() {
		return sendEmailToVisited;
	}

	public void setSendEmailToVisited(boolean sendEmailToVisited) {
		this.sendEmailToVisited = sendEmailToVisited;
	}

	public boolean isReceivesVisit() {
		return receivesVisit;
	}

	public void setReceivesVisit(boolean receivesVisit) {
		this.receivesVisit = receivesVisit;
	}

	public boolean isUsedBySelfServiceTerminal() {
		return usedBySelfServiceTerminal;
	}

	public void setUsedBySelfServiceTerminal(boolean usedBySelfServiceTerminal) {
		this.usedBySelfServiceTerminal = usedBySelfServiceTerminal;
	}

	public Integer getValidateLevel() {
		return validateLevel;
	}

	public void setValidateLevel(Integer validateLevel) {
		this.validateLevel = validateLevel;
	}

	public Integer getValidateAntiPassbac() {
		return validateAntiPassbac;
	}

	public void setValidateAntiPassbac(Integer validateAntiPassbac) {
		this.validateAntiPassbac = validateAntiPassbac;
	}

	public Integer getValidateStocking() {
		return validateStocking;
	}

	public void setValidateStocking(Integer validateStocking) {
		this.validateStocking = validateStocking;
	}

	public Integer getValidateCreditAccess() {
		return validateCreditAccess;
	}

	public void setValidateCreditAccess(Integer validateCreditAccess) {
		this.validateCreditAccess = validateCreditAccess;
	}

	public Integer getValidateScaleRange() {
		return validateScaleRange;
	}

	public void setValidateScaleRange(Integer validateScaleRange) {
		this.validateScaleRange = validateScaleRange;
	}

	public Integer getValidateTimeBand() {
		return validateTimeBand;
	}

	public void setValidateTimeBand(Integer validateTimeBand) {
		this.validateTimeBand = validateTimeBand;
	}

	public Integer getValidateAuthorizerRole() {
		return validateAuthorizerRole;
	}

	public void setValidateAuthorizerRole(Integer validateAuthorizerRole) {
		this.validateAuthorizerRole = validateAuthorizerRole;
	}

	public Integer getValidateAuthorizerPlace() {
		return validateAuthorizerPlace;
	}

	public void setValidateAuthorizerPlace(Integer validateAuthorizerPlace) {
		this.validateAuthorizerPlace = validateAuthorizerPlace;
	}

	public Integer getValidateVacancy() {
		return validateVacancy;
	}

	public void setValidateVacancy(Integer validateVacancy) {
		this.validateVacancy = validateVacancy;
	}

	public Integer getValidatePhysicallocation() {
		return validatePhysicallocation;
	}

	public void setValidatePhysicallocation(Integer validatePhysicallocation) {
		this.validatePhysicallocation = validatePhysicallocation;
	}

	public Integer getCheckCustomValidation() {
		return checkCustomValidation;
	}

	public void setCheckCustomValidation(Integer checkCustomValidation) {
		this.checkCustomValidation = checkCustomValidation;
	}
}
