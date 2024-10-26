public class RuleController {

    @PostMapping("/create")
    public Node createRule(@RequestBody String ruleString) {
        // Parse ruleString to create an AST Node object
    }

    @PostMapping("/combine")
    public Node combineRules(@RequestBody List<String> ruleStrings) {
        // Combine rules into a single AST
    }

    @PostMapping("/evaluate")
    public boolean evaluateRule(@RequestBody Map<String, Object> data, @RequestBody Node ruleAST) {
        // Evaluate the ruleAST against provided user data
    }
}

and

