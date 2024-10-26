@Entity
public class RuleEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String ruleName;
    @Lob
    private String ruleAST;  // Could be stored as JSON

    // Getters, setters, constructors
}