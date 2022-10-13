package lotr;
import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.SubTypes;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Arrays;
import java.util.Set;

public class CharacterFactory {
    public Character createCharacter() {
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> characters = reflections.get(SubTypes.of(Character.class).asClass());
        characters.remove(Noble.class);
        int index = new Random().nextInt(characters.size());
        try {
            // getting random out of Character possible options
            return (Character) characters.toArray(new Class[0])[index].getDeclaredConstructor().newInstance();
        }
        // handling exceptions provided by IntelliJ
        catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
