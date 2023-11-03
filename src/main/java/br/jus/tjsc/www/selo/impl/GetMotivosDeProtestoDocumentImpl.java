/*
 * An XML document type.
 * Localname: getMotivosDeProtesto
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMotivosDeProtesto(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMotivosDeProtestoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMotivosDeProtestoDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMotivosDeProtestoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOTIVOSDEPROTESTO$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMotivosDeProtesto");
    
    
    /**
     * Gets the "getMotivosDeProtesto" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeProtesto getGetMotivosDeProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeProtesto target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeProtesto)get_store().find_element_user(GETMOTIVOSDEPROTESTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMotivosDeProtesto" element
     */
    public void setGetMotivosDeProtesto(br.jus.tjsc.www.selo.GetMotivosDeProtesto getMotivosDeProtesto)
    {
        generatedSetterHelperImpl(getMotivosDeProtesto, GETMOTIVOSDEPROTESTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMotivosDeProtesto" element
     */
    public br.jus.tjsc.www.selo.GetMotivosDeProtesto addNewGetMotivosDeProtesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMotivosDeProtesto target = null;
            target = (br.jus.tjsc.www.selo.GetMotivosDeProtesto)get_store().add_element_user(GETMOTIVOSDEPROTESTO$0);
            return target;
        }
    }
}
