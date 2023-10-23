/*
 * An XML document type.
 * Localname: getEscolaridades
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEscolaridadesDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getEscolaridades(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetEscolaridadesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEscolaridadesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetEscolaridadesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETESCOLARIDADES$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getEscolaridades");
    
    
    /**
     * Gets the "getEscolaridades" element
     */
    public br.jus.tjsc.www.selo.GetEscolaridades getGetEscolaridades()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEscolaridades target = null;
            target = (br.jus.tjsc.www.selo.GetEscolaridades)get_store().find_element_user(GETESCOLARIDADES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getEscolaridades" element
     */
    public void setGetEscolaridades(br.jus.tjsc.www.selo.GetEscolaridades getEscolaridades)
    {
        generatedSetterHelperImpl(getEscolaridades, GETESCOLARIDADES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getEscolaridades" element
     */
    public br.jus.tjsc.www.selo.GetEscolaridades addNewGetEscolaridades()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetEscolaridades target = null;
            target = (br.jus.tjsc.www.selo.GetEscolaridades)get_store().add_element_user(GETESCOLARIDADES$0);
            return target;
        }
    }
}
