import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InstagramBot {
    public static void main(String[] args) {
        // Configurar o caminho do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.29.0\\chromedriver.exe");

        // Inicializar o navegador
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        try {
            // 1️⃣ Acessar o Instagram
            driver.get("https://www.instagram.com/");
            Thread.sleep(6000); // Esperar carregar

            // 2️⃣ Digitar o nome de usuário
            WebElement usernameInput = driver.findElement(By.name("username"));
            usernameInput.sendKeys("seu_usuario");

            // 3️⃣ Digitar a senha
            WebElement passwordInput = driver.findElement(By.name("password"));
            passwordInput.sendKeys("sua_senha");

            // 4️⃣ Clicar no botão de login
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
            loginButton.click();

            Thread.sleep(15000); // Tempo para logar

            // 5️⃣ Acessar um post específico (substitua pela URL do post desejado)
            driver.get("https://www.instagram.com/p/DHdZGIft1fV/");
            Thread.sleep(5000);

            // 6️⃣ Aguardar e localizar o botão de curtir
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           // Encontrar o botão de curtida pelo XPath
           WebElement likeButton = driver.findElement(By.xpath("//button//*[name()='svg' and @aria-label='Curtir']"));
           // Garantir que o botão esteja visível
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", likeButton);

            // Clicar no botão de curtida
            likeButton.click();
            System.out.println("Post curtido com sucesso!");
            ////// WebElement likeButton = wait.until(ExpectedConditions.elementToBeClickable(
           //////     By.xpath("//span[contains(@class, 'fr66n')]//button")));

            // 7️⃣ Verificar se o post já está curtido
            WebElement svgIcon = likeButton.findElement(By.tagName("svg"));
            String fillColor = svgIcon.getAttribute("fill");

            if (fillColor.equals("none")) { // "none" significa que ainda não foi curtido
                likeButton.click();
                System.out.println("Post curtido com sucesso!");
            } else {
                System.out.println("O post já foi curtido anteriormente.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fechar o navegador após o teste
            driver.quit();
        }
    }
}
